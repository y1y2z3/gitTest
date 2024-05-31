package com.yyz;

import lombok.Data;

@Data
public class Student {
    private String name;

    private int age;

    public void read(String bookName) {
        System.out.println("before reading!!!");
        System.out.println("first person add one operation before...");
        System.out.println(getName() + "is reading " + bookName + "book!");
        System.out.println("first person add one operation after...");
        System.out.println("after reading!!!");
    }
}
