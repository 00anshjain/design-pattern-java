package com.designpattern.builderdesignpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuilderDesignPatternApplication {

    public static void main(String[] args) {
        Url url = new Url.UrlBuilder()
                .protocol("https")
                .hostName("www.example.com")
                .port("8080")
                .pathParam("/path/to/resource")
                .queryParam("key1=value1&key2=value2")
                .build();

        System.out.println("Constructed URL: " + url.toString());
        //Constructed URL: Url{protocol='https', hostName='www.example.com', port='8080', pathParam='/path/to/resource', queryParam='key1=value1&key2=value2'}

        SpringApplication.run(BuilderDesignPatternApplication.class, args);
    }

}
