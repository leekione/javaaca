package com.kh.account;

public class Account {
    private String accountName;     //예금주 이름
    private String accountNumber;   //계좌 번호
    private int balance;            //잔고
    
    private static int accountNum; //계좌번호 카운트

    private final int ACCOUNT_NUM_SIZE = 3; //계좌번호 3자리

    public Account(String accountName) {
        this.accountName = accountName;
        //계좌번호 생성
        this.accountNumber = createAccountNumber(++accountNum);

    }

    //입금
    public void deposit(int money) {
        if (money <= 0 || money > 40_000) {
            System.out.println("입금 범위 초과( 1원 ~ 4만원)");
            return;
        }
        if (balance + money > 100_000) {
            System.out.println("예치금 10만원을 초과합니다.");
            return;
        }
        balance += money;

    }

    //출금
    public void withdraw(int money) {
        if (money <= 0 || money > 40_000) {
            System.out.println("출금 범위 초과( 1원 ~ 4만원)");
            return;
        }
        if (balance - money < 0) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        balance -= money;
    }
    //조회

    @Override
    public String toString() {
        return "예금주 명 : " + accountName +
                ", 계좌번호 : " + accountNumber +
                ", 잔액 : " + balance;
    }

    //계좌번호생성
    private String createAccountNumber(int accountNum) {
        String str = "" + accountNum;
        int addZero = ACCOUNT_NUM_SIZE - str.length();
        for (int i = 0; i < addZero; i++) {
            str = "0" + str;
        }
        return str;

    }
    //계좌번호 반환
    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }
    
    //예금주 이름 반환
    public String getAccountName() {
        return accountName;
    }
}
