package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElements {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("adf","gfh","fhgy","dhd");
        List<String> list2 = Arrays.asList("adf","gfeh","fhgy","dehd");

        List<String> commonElements = list1.stream().filter(list2::contains).collect(Collectors.toList());
        System.out.println(commonElements);
    }
}
