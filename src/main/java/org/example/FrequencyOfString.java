package org.example;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfString {
    public static void main(String[] args) {
        String input = "Hello World";

        Map<Character,Long> freqMap = input.toLowerCase().chars().filter(Character::isLetter).mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(freqMap);
    }
}
