package com.designpattern.singletondesignpattern;

import java.util.Objects;

public class LazySingleton {
    /**
     * Lazy initialization means the application will create an instance when it is requested.
     * However, this can be used when you have a non-thread-safe application. If used in multi threading it might break,
     * Why? because if your getInstance method is invoked by two threads at same time then!!!!
     * When to use?  Non thread safe and creating common resources like db connection.
     */
    private static LazySingleton instance = null;
    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if(Objects.isNull(instance)) {
            instance = new LazySingleton();
        }
        return instance;
    }

}
