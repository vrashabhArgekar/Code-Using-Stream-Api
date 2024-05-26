package org.example;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello World";
        String reversedString = new StringBuilder(str).reverse().toString();
        System.out.println(reversedString);
    }
}
