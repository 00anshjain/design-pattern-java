package com.designpattern.strategydesignpattern;

import java.util.List;

public class MergeSortStrategy implements SortingStrategy{

    @Override
    public void sort(List<Integer> arr) {
        System.out.println("Sorting using Merge sort");
    }
}
