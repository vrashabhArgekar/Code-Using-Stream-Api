package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AscendingOrder {
    public static void main(String[] args) {

        List<Integer> input = Arrays.asList(5,10,3,2,7,9,4,2,8,0);

//      distinct() = to remove duplicate values.
//      sorted() = to arrange the input in ascending order
        List<Integer> ascendingOrder = input.stream().sorted().distinct().collect(Collectors.toList());
        System.out.println(ascendingOrder);
    }
}
