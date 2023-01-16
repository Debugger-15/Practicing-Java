package com.ronak.model;

import lombok.Data;

@Data
public class Students {
    private int id;
    private String name;
    private int age;

    public Students(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
