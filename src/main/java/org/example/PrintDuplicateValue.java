package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintDuplicateValue {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1,4,6,4,3,2,4,6,42,1);

        List<Integer> printDuplicateValues = input.stream().filter(i->input.indexOf(i)!=input.lastIndexOf(i)).distinct().collect(Collectors.toList());
        System.out.println(printDuplicateValues);
    }
}
