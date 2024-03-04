package com.designpattern.strategydesignpattern;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class SortingContext {
    private SortingStrategy sortingStrategy;

    public SortingContext(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }
    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.setSortingStrategy(sortingStrategy);
    }

    public void performSort(List<Integer> arr) {
        sortingStrategy.sort(arr);
    }

}
