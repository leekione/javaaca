package com.kh.dic;

import java.util.*;


public class Dictionary {

    private String word;
    private String mean;

    final int MAX_SIZE_WORD = 5;    //등록 최대 단어 수

    private String order;   // 목록의 순서 초기값 0;




    Scanner scanner = new Scanner(System.in);

    TreeMap<String, String> dictionary = new TreeMap<>();

    public void saveVoca() {    //단어 저장
        System.out.println("단어를 입력하세요");
        System.out.print(" >> ");
        word = scanner.nextLine();

        System.out.println("뜻을 입력하세요");
        System.out.print(">> ");
        mean = scanner.nextLine();

        if (dictionary.containsKey(word)) {     //이미 등록되었을 경우
            throw new DictionaryException("이미 등록되었습니다.");
        } else {
            dictionary.put(word.toLowerCase(), mean);

            System.out.println(word.toLowerCase() + " : " + dictionary.get(word.toLowerCase()));
        }
        if (dictionary.size() > MAX_SIZE_WORD) {    //최대 저장 단어 초과시
            dictionary.remove(word.toLowerCase());
            System.out.println("최대 5개단어만 저장할 수 있습니다.");


        }
    }

    public void searchVoca() {  //단어 검색
        System.out.println("찾고자 하는 단어를 입력하세요");
        System.out.print(" >> ");
        word = scanner.nextLine();

        if (dictionary.containsKey((word.toLowerCase()))) {

            System.out.println(word.toLowerCase() + " : " + dictionary.get(word.toLowerCase()));
        } else {
            System.out.println("단어를 검색할 수 없습니다.");

        }

    }

    public void modifyVoca() {      //단어 수정
        System.out.println("수정하고자 하는 단어를 입력하세요");
        System.out.print(" >> ");
        word = scanner.nextLine();

        System.out.println("수정할 뜻을 입력해주세요");
        System.out.print(" >> ");
        mean = scanner.nextLine();
        if (dictionary.containsKey(word.toLowerCase())) {
            dictionary.replace(word, mean);
            System.out.println(word.toLowerCase() + " : " + dictionary.get(word.toLowerCase()));
        } else {
            System.out.println("단어를 검색할 수 없습니다");
        }
    }

    public void deleteVoca() {      //단어 삭제
        System.out.println("삭제하고자 하는 단어를 입력하세요");
        System.out.print(" >> ");
        word = scanner.nextLine();
        if (dictionary.containsKey(word.toLowerCase())) {
            dictionary.remove(word.toLowerCase());
            System.out.println("단어" + word.toLowerCase() + "가 삭제 되었습니다.");
        } else {
            System.out.println("단어를 검색할 수 없습니다.");
        }
    }


    public void listVoca() {        //단어 목록 1.오름차순 2.내림차순
        System.out.println("1.오름차순 2.내림차순");
        System.out.print(" >> ");
        order = scanner.nextLine();
        switch (order) {
            case "1":
                Set<Map.Entry<String, String>> entries = dictionary.entrySet();
                for (Map.Entry<String, String> ele : entries) {
                    System.out.println(ele.getKey() + " : " + ele.getValue());

                }
                break;
            case "2":
                NavigableMap<String, String> stringStringNavigableMap = dictionary.descendingMap();
                System.out.println(stringStringNavigableMap);
                break;


        }
    }


    public void showAlpabetStartWord() {    //색인
        System.out.println("찾고 싶은 단어의 첫 글자");
        System.out.print(" >> ");
        String searchWord = scanner.nextLine();
//        searchWord = String.valueOf(searchWord.charAt(0));
        char nextLetter = (char)(searchWord.charAt(0) +1);


        NavigableMap<String, String> subMap = dictionary.subMap(searchWord, true,String.valueOf(nextLetter),false);
        System.out.println(subMap.keySet());
    }


    public void statisticsVoca() {  //통계
        System.out.println("저장된 단어 갯수" + dictionary.size());

        System.out.println("문자수가 가장 많은 단어 ");

        System.out.println("단어 글자수 내림차수 정렬");
//        Comparator comparator = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                int result = 0;
//                if (o1.length() < o2.length()) {
//                    result = 1;
//
//                } else if (o1.length() > o2.length()) {
//                    result = -1;
//                }
//                return result;
//            }
//
//
//        };





    }

    public String getWord() {
        return word;
    }

    public String getMean() {
        return mean;
    }


}
