package com.kh.dic;

import java.util.Scanner;

public class DictionaryMain {
    public static void main(String[] args) {

        Dictionary dictionary = new Dictionary();
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;
        do {
            System.out.println("메뉴] 1.저장 2.검색 3.수정 4.삭제 5.목록 6.색인 7.통계 8.종료");
            System.out.print(" >> ");
            String menu = scanner.nextLine();

            switch (menu) {
                case "1":   //저장
                    try {
                        dictionary.saveVoca();
                    } catch (Exception e) {
                       System.out.println(e.getMessage());
                    }

                    break;
                case "2":   //검색
                dictionary.searchVoca();
                    break;
                case "3":   //수정
                    dictionary.modifyVoca();
                    break;
                case "4":   //삭제
                    dictionary.deleteVoca();
                    break;
                case "5":   //목록
                    dictionary.listVoca();
                    break;
                case "6":   //색인
                    dictionary.showAlpabetStartWord();
                    break;
                case "7":   //통계
                    dictionary.statisticsVoca();
                    break;
                case "8":   //종료
                    System.out.println("종료합니다");
                    stop = true;
                    continue;

                default:    //그 외 입력시
                    System.out.println("메뉴를 다시 입력해주세요.");


            }

        } while (!stop);

    }
}
