package com.designpattern.strategydesignpattern;

import java.util.List;

public class QuickSortStrategy implements SortingStrategy {
    @Override
    public void sort(List<Integer> arr) {
        System.out.println("Sorting using Quick sort");
    }
}
