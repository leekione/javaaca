package com.kh.exam4;

import java.util.Arrays;
import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Account[] accounts = new Account[10];
        Scanner scanner = new Scanner(System.in);

        Account account = null;

        boolean stop = false;
        do {
            System.out.println("1.계좌 개설, 2.입금, 3.출금, 4.잔액, 5.계좌 폐지, 6.계좌 현황, 7.종료");

            System.out.print(">>");
            String inputValue = scanner.nextLine();

            int money = 0;
            int count = 0;

            switch (inputValue) {
                case "1":
                    System.out.println("이름을 입력하세요");
                    System.out.print(">>");
                    String name = scanner.nextLine();

                    boolean flag = false;
                    int i = 0;
                    for (i = 0; i < accounts.length; i++) {
                        if (accounts[i] == null) {
                            accounts[i] = new Account(name);
                            System.out.println(name + "님의 계좌가 개설되었습니다.");
                            flag = true;
                            count++;
                            break;

                        }
                    }
                    if (!flag) {
                        System.out.println("여유 공간이 부족합니다.");

                    } else {
                        System.out.println("계좌" + i + "번 생성완료");
                        System.out.println(Arrays.toString(accounts));

                    }
                    break;

                case "2": //입금


                    if (accounts == null) {
                        System.out.println("계좌 미개설 상태입니다~");
                        continue;
                    }

                    System.out.print("입금액 >> ");
                    money = Integer.valueOf(scanner.nextLine());
                    account.deposit(money);

                    break;


                case "3":
                    if (account == null) {
                        System.out.println("계좌 미개설 상태입니다~");
                        continue;
                    }
                    System.out.print("출금액 >> ");
                    money = Integer.valueOf(scanner.nextLine());
                    account.withdraw(money);

                    break;

                case "4":
                    if (account == null) {
                        System.out.println("계좌 미개설 상태입니다~");
                        continue;
                    }

                    int balance = account.getBalance();
                    System.out.println(account.getAccountOwner() + " 님의 잔액 : " + balance);
                    break;

                case "5":   //폐지
                    System.out.print("폐지할 계좌 : ");
                    String accountOwnerName = scanner.nextLine();
                    boolean finded = false;
                    for (int j = 0; j < accounts.length; j++) {
                        if (accounts[j].getAccountOwner().equals(accountOwnerName)) {
                            accounts[j] = null;
                            finded = true;
                            break;

                        }
                    }
                    if (!finded) {
                        System.out.println("폐지할 계좌가 없습니다");
                        continue;

                    }

                case "6":
                    for (i = 0; i<count; i++) {
                        if (account == null) continue;
                        System.out.println(account.toString());
                        break;
                    }


                case "7":

                    System.out.println("종료");
                    stop = true;
                    break;
                default:


            }
        }
        while (!stop);

    }
}


