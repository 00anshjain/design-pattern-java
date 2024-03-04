package com.designpattern.strategydesignpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class StrategyDesignPatternApplication {

    public static void main(String[] args) {
        SortingContext sortingContext = new SortingContext(new BubbleSortStrategy());
        sortingContext.performSort(Arrays.asList(5, 10, 15));

        sortingContext = new SortingContext(new MergeSortStrategy());
        sortingContext.performSort(Arrays.asList(5, 10, 15));

        SpringApplication.run(StrategyDesignPatternApplication.class, args);
    }

}
