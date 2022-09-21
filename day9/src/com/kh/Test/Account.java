package com.kh.Test;

public class Account {

    private String accountName;
    private int balance;
    private String account_number;
    private final int MAX_DEPOSIT = 40000; // 입금 1회 최대 한도
    private final int MIN_WITHDRAW = 40000; // 출금 1회 최대 한도

    private final int MINMONEY = 0; // 통장의 최소한의 금액
    
    private final int MAXMONEY = 100000; //통장의 최대한의 금액

    private final int MAXCOUNT = 3;

    private static int count;
    public Account(String accountName) {
        this.accountName = accountName;
        count++;

        String str = count + "";
        int length = MAXCOUNT - str.length();
        for (int i = 0; i < length; i++) {
            str = "0" + str;
        }
        account_number = str;
    }






    public int deposit(int money) {     //입금
        if (money > MAX_DEPOSIT) {
            System.out.println("1회 최대 입금 금액은 4만원 미만입니다.");
            return this.balance;

        } else if (this.balance + money >= MAXMONEY) {
            System.out.println("최대 예치 금액은 10만원 이합니다.");
            return this.balance;
        } else {
            return this.balance += money;
        }

    }

    public int withdraw(int money) {    //출금
        if (money > MIN_WITHDRAW ) {
            System.out.println("1회 최대 출금 금액은 4만원 미만입니다.");
            return this.balance;

        } else if (this.balance - money < MINMONEY) {
            System.out.println("잔고가 부족 합니다.");
            return this.balance;
        }else
            return this.balance -= money;
    }



    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return
                "예금주 명 = " + accountName + '\'' +
                ", 잔액 = " + balance +
                ", 계좌번호 = " + account_number + '\'';
    }
}
