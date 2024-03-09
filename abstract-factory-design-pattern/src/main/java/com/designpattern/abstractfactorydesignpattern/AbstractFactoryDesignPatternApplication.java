package com.designpattern.abstractfactorydesignpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AbstractFactoryDesignPatternApplication {

    public static void main(String[] args) {
        //-> Get university (Government or Private) based on score from UniversityFactory
        // -> Get college in the university based on branch(Engineering or Medical)
        UniversityFactory abstractUniversityfactory = UniversityFactory.getUniversity(100);
        College college = abstractUniversityfactory.getCollege("ENGINEERING");
        System.out.println(UniversityFactory.getUniversity(100));
        System.out.println(college.getFees());
        System.out.println(college.getCourseList());

        SpringApplication.run(AbstractFactoryDesignPatternApplication.class, args);
    }

}
