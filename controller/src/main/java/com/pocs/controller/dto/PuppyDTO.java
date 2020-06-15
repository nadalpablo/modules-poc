package com.pocs.controller.dto;

public class PuppyDTO {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{\"PuppyDTO\":{"
            + "\"name\":\"" + name + "\""
            + ", \"age\":\"" + age + "\""
            + "}}";
    }
}
