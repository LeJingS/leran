package com.thi;

public class Boy {
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

    public Boy(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public void marry(Girl girl) {
        System.out.println("marry for" + girl.getName());
    }

    public  void shout() {
        if(this.age >= 22){
            System.out.println("可以");
        }
        else{
            System.out.println("不可");
        }
    }
}
