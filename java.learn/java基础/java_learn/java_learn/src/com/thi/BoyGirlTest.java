package com.thi;

public class BoyGirlTest {
    public static void main(String[] args) {
        Boy boy1 = new Boy(24, "joke");
        Girl girl1 = new Girl(21,"rou");
        girl1.marry(boy1);
        boy1.shout();
    }
}
