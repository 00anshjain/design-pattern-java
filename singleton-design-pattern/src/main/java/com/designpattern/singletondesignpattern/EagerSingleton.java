package com.designpattern.singletondesignpattern;

public class EagerSingleton {
    /**
     * This is eager initialization concept where
     * as soon as JVM start the object will be created irrespective whether it got accessed by
     * any code in application or not.
     * When to use : One possible usage can be let say your application has some static cache which is required to be loaded.
     * Drawback : As mentioned consumes resources even if the application does not use it.
     */
    private static final EagerSingleton instance = new EagerSingleton();
    private EagerSingleton() {

    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
