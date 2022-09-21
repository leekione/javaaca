package com.kh.exercise17.q1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1);

        List<Integer> list2 = Arrays.asList(1, 2); //크기가 고정
        try {
            list2.add(3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
            System.out.println(list2);
    }
}
