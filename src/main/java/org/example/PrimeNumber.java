package org.example;

import java.util.stream.IntStream;

public class PrimeNumber {
    public static void main(String[] args) {
        int  limit = 100;
        IntStream.rangeClosed(2,limit).filter(n->isPrime(n)).forEach(System.out::println);
    }
    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2,(int)Math.sqrt(number)).noneMatch(i->number%i==0);
    }
}
