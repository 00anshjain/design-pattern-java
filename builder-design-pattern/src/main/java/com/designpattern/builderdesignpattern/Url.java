package com.designpattern.builderdesignpattern;

public class Url {
    private String protocol;
    private String hostName;
    private String port;
    private String pathParam;
    private String queryParam;
    private Url(UrlBuilder urlBuilder) {
        this.protocol = urlBuilder.protocol;
        this.hostName = urlBuilder.hostName;
        this.port = urlBuilder.port;
        this.pathParam = urlBuilder.pathParam;
        this.queryParam = urlBuilder.queryParam;
    }
    @Override
    public String toString() {
        return "Url{" +
                "protocol='" + protocol + '\'' +
                ", hostName='" + hostName + '\'' +
                ", port='" + port + '\'' +
                ", pathParam='" + pathParam + '\'' +
                ", queryParam='" + queryParam + '\'' +
                '}';
    }

    public static class UrlBuilder {
        private String protocol;
        private String hostName;
        private String port;
        private String pathParam;
        private String queryParam;
        public UrlBuilder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public UrlBuilder hostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public UrlBuilder port(String port) {
            this.port = port;
            return this;
        }
        public UrlBuilder pathParam(String pathParam) {
            this.pathParam = pathParam;
            return this;
        }
        public UrlBuilder queryParam(String queryParam) {
            this.queryParam = queryParam;
            return this;
        }

        public Url build() {
            return new Url(this);
        }

    }

}
