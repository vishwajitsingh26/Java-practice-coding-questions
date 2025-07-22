package org.practice;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        if(instance != null) {
            throw new IllegalStateException("Instance already created. Use getInstance() method.");
        }
        System.out.println();
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) { // double-checked locking
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
