package com.kh.exam3;

public class Account {

    private final int LIMIT_MONEY_ONETIME = 100_000;
    private final int LIMIT_BALANCE = -1_000_000;

    private String accountOwner;
    private int balance;

    public Account(String accountOwner) {
        this.accountOwner = accountOwner;

    }

    public void deposit(int money) {
        if (money < 1 || money > LIMIT_MONEY_ONETIME) {
            System.out.println("1회 입금액은" +LIMIT_MONEY_ONETIME+ "만원 미만이어야 합니다.");
            return;
        }
        this.balance += money;
//        if (money < 100000) {
//
//        this.balance += money;
//        }else{
//            this.balance = balance;
//            System.out.println("한도초과");
//        }

    }

    public void withdraw(int money) {
        if (money < 1) {

            return;
        }
        if (this.balance - money < LIMIT_BALANCE) {

            System.out.println("잔액 한도는 " + LIMIT_BALANCE+ " 입니다.");
            return;
        }
        this.balance -= money;
//        if (this.balance < 1000000) {
//            this.balance -= money;
//        } else {
//            this.balance = balance;
//            System.out.println("마이너스통장");
//
//        }


    }

    public String getAccountOwner() {
        return accountOwner;
    }

    @Override
    public String toString() {
        return "계좌{" +
                "계좌소유자명='" + accountOwner + '\'' +
                ", 잔고=" + balance +
                '}';
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public int getBalance() {

        return balance;
    }

    public void setBalance(int balance) {


        this.balance = balance;
    }


}
