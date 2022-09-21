package com.kh.exam4;

public class Book3 {
    private String title;
    private String bookId;
    private String account_number;



    private static int count;
    private final int BOOKID_SIZE = 3;

    public Book3(String title) {
        this.title = title;
        count = getCount() + 1;
        String tmp = count + "";
        int length = BOOKID_SIZE - tmp.length();
        for (int i = 0; i < length; i++) {
            tmp = "0" + count;
        }
        account_number = tmp;
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
    public String getAccount_number() {
        return account_number;
    }
}
