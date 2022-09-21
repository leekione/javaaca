package com.kh.exam4;

import java.util.Arrays;

public class BookMain {
    public static void main(String[] args) {
        Book[] books = new Book[5];

        books[0] = new Book();
        books[1] = new Book();
        books[2] = new Book();
        books[3] = new Book();
        books[4] = new Book();

        books[3] = null;

        System.out.println(Arrays.toString(books));

        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = new Book();
            }
        }

        books[4] = null;
        
        
        System.out.println(Arrays.toString(books));
        
        //책장에 책을 꽂을 장소가 있는지 체크
        boolean isFull = true;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                isFull = false;
                break;
            }
        }
        //책을 꽂을 장소가 없으면 '책 꽂을 장소가 부족합니다' 출력
        //              있으면 여유공간 출력
        if (isFull) {
            System.out.println("책 꽂을 장소가 부족함");
        }else{
            //여유공간 출력
            int bookCount = 0;
            for (int i = 0; i < books.length; i++) {
                if (books[i] == null) {
                    bookCount++;
                }
            }
            System.out.println("여유공간 : " + bookCount);
        }

    }
}
