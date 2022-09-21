package com.kh.exercise17.q7;

import java.util.Objects;

public class MyData implements Comparable<MyData> {
    String str;

    public MyData(String str) {
        this.str = str;
    }

    //오름차 순

    @Override
    public int compareTo(MyData o) {
        int result = 0;
//        MyData md = (MyData) o;
//
//        if (str.length() > md.str.length() ) {
//            result = 1;
//        } else if (str.length() < md.str.length()) {
//            result = -1;
//        }
//        return result;
        if (str.length() > o.str.length() ) {
            result = 1;
        } else if (str.length() < o.str.length()) {
            result = -1;
        }
        return result;


//        return this.str.compareTo(o.str); //가나다순
        //return this.str.compareTo(o.str)* -1; //가나다역순

    }

    @Override

    public String toString() {
        return str;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
