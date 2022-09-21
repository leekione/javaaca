package com.kh.exam2;

public class Student extends Person{
    {
        System.out.println("4");
    }
    static{
        System.out.println("7");
    }

    public Student() {
//        System.out.println("1");
        super(); // 실행문 가장 상단에 있어야한다
        System.out.println("2");
    }
}
