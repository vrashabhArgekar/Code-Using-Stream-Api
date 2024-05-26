package org.example.Exception;

public class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

class Test{
    public static void main(String[] args) {
        try {
            int age = -5;
            if (age < 0) {
                throw new CustomException("Age cant be negative");
            }
        }
        catch (CustomException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
