package com.kh.exam2;

public class Main {
    public static void main(String[] args) {
//        AirConditioner airConditioner = new AirConditioner();
//        Tv tv = new Tv();
//        Radio radio = new Radio();
//
//        airConditioner.on();
//        tv.on();
//        radio.on();


        HomeAppliances homeAppliances = new AirConditioner();
        homeAppliances.on();

        on(new AirConditioner());
        on(new Tv());
        on(new Radio());
        //인터페이스를 사용한 다향성
    }

    public static void on(HomeAppliances homeAppliances) {
        homeAppliances.on();
        homeAppliances.off();
    }
}
