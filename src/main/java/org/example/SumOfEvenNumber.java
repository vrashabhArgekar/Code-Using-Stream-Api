package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfEvenNumber {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1,3,5,4,2,6,8,9,10);

        int sumOfEvenNumbers = input.stream().filter(n->n%2==0).mapToInt(Integer::intValue).sum();
        System.out.println(sumOfEvenNumbers);
    }
}
