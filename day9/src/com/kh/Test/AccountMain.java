package com.kh.Test;

import java.util.Arrays;
import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {


        Account[] accounts = new Account[5];
        Scanner scanner = new Scanner(System.in);

        int money = 0; // 입출금할 금액 초기값

        boolean stop = false;
        do {
            System.out.println("1.신규 2.폐지 3.입금 4.출금 5.계좌조회(개별) 6.계좌조회(전체) 7.종료");
            System.out.print(">>");
            String menu = scanner.nextLine();
            switch (menu) {
                case "1": // 계좌 신규 개설
                    System.out.println("이름을 입력해 주세요");
                    System.out.print(" >> ");
                    String name = scanner.nextLine();
                    boolean dupChk = false;
                    for (int i = 0; i < accounts.length; i++) {
                        if (accounts[i] == null) {
                            accounts[i] = new Account(name);
                            System.out.println(name + "님의 계좌 생성");
                            System.out.println(accounts[i]);
                            break;
                        }
                        if (accounts[i].getAccountName().equals(name)) {
                            dupChk = true;
                            System.out.println("동명이인 존재");
                            break;

                        }


//                            } 중복된 이름시 계설 불가능한거 실패


                    }

                    break;


                case "2":   //폐지
                    System.out.print("폐지할 예금 주 명 : ");
                    String deletename = scanner.nextLine();

                    for (int i = 0; i < accounts.length; i++) {
                        if (accounts[i].getAccountName().equals(deletename)) {
                            if (accounts[i].getBalance() <= 0) {
                                accounts[i] = null;
                                break;
                            }
                            System.out.println(accounts[i].getAccountName() + "님의 계좌가 폐지되었습니다.");
                        }


                    }
                    break;
                case "3":   //입금
                    System.out.print("입금할 예금 주 계좌번호 : ");
                    String depositNumber = scanner.nextLine();
                    System.out.print("금액 : ");
                    money = Integer.valueOf(scanner.nextLine());

                    for (int j = 0; j < accounts.length; j++) {
                        if (accounts[j] == null) {
                            continue;
                        }
                        if (accounts[j].getAccount_number().equals(depositNumber)) {
                            accounts[j].deposit(money);

                        }
                        System.out.println(accounts[j]);


                    }
                    break;
                case "4": // 출금
                    System.out.print("출금할 예금 주 계좌번호 : ");
                    String withdrawNumber = scanner.nextLine();
                    System.out.print("금액 : ");
                    money = Integer.valueOf(scanner.nextLine());

                    for (int j = 0; j < accounts.length; j++) {
                        if (accounts[j] == null) {
                            continue;
                        }
                        if (accounts[j].getAccount_number().equals(withdrawNumber)) {
                            accounts[j].withdraw(money);
                        }
                        System.out.println(accounts[j]);


                    }
                    break;
                case "5": // 개별 조회
                    System.out.print("조회할 계좌번호 : ");
                    String acc_number = scanner.nextLine();
                    for (int i = 0; i < accounts.length; i++) {
                        if (accounts[i] == null) {
                            continue;
                        }
                        if (accounts[i].getAccount_number().equals(acc_number)) {
                            System.out.println("계좌번호 : " + accounts[i].getAccount_number() +
                                    " 예금주 이름 : " + accounts[i].getAccountName() + " 잔고 : " + accounts[i].getBalance());
                        }

                    }
                    break;
                case "6": // 전체 조회
                    int usingCount = 0;
                    for (int i = 0; i < accounts.length; i++) {
                        if (accounts[i] == null) continue;
                        System.out.println(accounts[i]);
                        ++usingCount;


                    }
                    System.out.println("사용중인 계좌 수 : " + usingCount);
                    System.out.println("잔여 계좌 수 : " + (accounts.length - usingCount));
                    break;
                case "7": //종료
                    System.out.println("종료합니다!");

                    System.exit(1);
                    break;

                default: // 그 외 입력시
                    System.out.println("메뉴를 다시 입력해 주세요");
            }


        }
        while (!stop);
    }
}
