package com.designpattern.singletondesignpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingletonDesignPatternApplication {
	public static void main(String[] args) {
		System.out.println(EagerSingleton.getInstance());
		System.out.println(LazySingleton.getInstance());
		System.out.println(MultithreadSingleton.getInstance());
		SpringApplication.run(SingletonDesignPatternApplication.class, args);
	}

}
