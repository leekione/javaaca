package com.kh.exercise10.q10;

public class C extends B{
    C(){
        System.out.println("C 생성자1");
    }
    C(int a){
        super(a);
        System.out.println("C 생성자2");
    }
}
