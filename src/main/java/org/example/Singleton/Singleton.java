package org.example.Singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            System.out.println("created");
        }
        return instance;
    }
}

class SingletonClass {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
    }
}
