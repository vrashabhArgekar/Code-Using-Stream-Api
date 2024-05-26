package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindLargestNumber {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(2,1,4,8,5,4,7,9,0);

        List<Integer> findLargestNumber = input.stream().sorted(Comparator.reverseOrder()).distinct().collect(Collectors.toList());
        System.out.println(findLargestNumber.get(0));
    }
}
