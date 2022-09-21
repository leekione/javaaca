package com.kh.exam4;

public class Book2 {
    private String title;
    private String bookId;
    private static int count;
    private final int BOOKID_SIZE = 3;

    public Book2(String title) {
        this.title = title;
        count = getCount() + 1;

        String tmp = count + "";
        int length = BOOKID_SIZE - tmp.length();
        for (int i = 0; i < length; i++) {
            tmp = "0    " + tmp;
        }
        bookId = tmp;
    }

    public String getTitle() {
        return title;
    }

    public String getBookId() {
        return bookId;
    }

    public static int getCount() {
        return count;
    }
}
