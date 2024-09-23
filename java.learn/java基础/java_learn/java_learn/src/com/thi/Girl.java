package com.thi;

public class Girl {
    private int age;
    private String name;

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

    public Girl(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public void marry(Boy boy) {
        System.out.println("I want to marry " + boy.getName() );

        boy.marry(this);
    }
    public int compare(Girl girl) {
        return this.age - girl.age;
    }
}
