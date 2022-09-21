package com.kh.exam3;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account account = null;

        boolean stop = false;
        do {


            System.out.println("1.계좌 개설, 2.입금, 3.출금, 4.잔액, 5.종료");

            System.out.print(">>");
            int input = Integer.parseInt(scanner.nextLine());

            int money = 0;

            if (input == 1) {
                System.out.println("이름을 입력하세요");
                System.out.print(">>");
                String name = scanner.nextLine();
                account = new Account(name);
                System.out.println(name + "님의 계좌가 개설되었습니다.");


            } else if (input == 2) { //입금
                if (account == null) {
                    System.out.println("계좌 미개설 상태입니다~");
                    continue;
                }
                System.out.print("입금액 >> ");
                money = Integer.valueOf(scanner.nextLine());
                account.deposit(money);




            } else if (input == 3) {
                if (account == null) {
                    System.out.println("계좌 미개설 상태입니다~");
                    continue;
                }
                System.out.print("출금액 >> ");
                money = Integer.valueOf(scanner.nextLine());
                account.withdraw(money);

            } else if (input == 4) {
                if (account == null) {
                    System.out.println("계좌 미개설 상태입니다~");
                    continue;
                }

                int balance = account.getBalance();
                System.out.println(account.getAccountOwner() + " 님의 잔액 : " + balance);


            } else if (input == 5) {

                System.out.println("종료");
                stop = true;


            }
        } while (!stop);

    }
}


