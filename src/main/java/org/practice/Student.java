package org.practice;

import java.util.Date;

public final class Student {

    private final int age;
    private final String name;

    private final Date dob;

    public Student(int age, String name, Date dob) {
        this.age = age;
        this.name = name;
        this.dob = new Date(dob.getTime()); // defensive copy to ensure immutability
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        return new Date(dob.getTime()); // defensive copy to ensure immutability
    }
}
