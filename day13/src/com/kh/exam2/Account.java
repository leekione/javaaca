package com.kh.exam2;

import java.util.Objects;

public class Account {
    private String accountName;     //예금주
    private int balance;         //잔액

    public Account(String accountName) {
        this.accountName = accountName;
    }

    //입금
    public void deposit(int money) throws Exception {
        if (money < 0) {
            throw new Exception("음수값 발생!");
        }
        if (money > 40_000) {
            throw new Exception("입금한도 4만원 초과!");
        }
        balance += money;
    }

    //출금
    public void withdraw(int money) throws WithdrawUnderException, WithdrawOverException {
        if (money < 0) {
            throw new WithdrawUnderException("출금 : 음수값 발생");
        }
        if (money > 40_000) {
            throw new WithdrawOverException("출금 : 4만원 초과");
        }
        balance -= money;
    }

    @Override
    public String toString() {
        return "예금주 : " + accountName +
                ", 잔액 : " + balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountName, account.accountName);
    }

    public String getAccountName() {
        return accountName;
    }

    public int getbalance() {
        return balance;
    }

}
