package com.kh.exam8;

public class Pet {
    private String name;    // 이름
    private int age;        // 나이


    // 애완동물의 이름과 나이를 각각 기본 값으로 초기화하면서
    // Pet 객체를 생성한다

    public Pet() {
        name = "";
        age = 0;
    }

    // 애완동물의 이름과 나이를 각각 주어진 값으로 초기화하면서
    // Pet 객체를 생성한다
    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 애완동물의 이름을 변경한다
    public void setName(String newName) {
        this.name = newName;
    }

    // 애완동물의 나이를 변경한다
    public void setAge(int newAge) {
        this.age = newAge;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // 애완동물의 이름과 나이를 알려 준다
    @Override
    public String toString() {
        return ("이름: " + name + "\n나이: " + age+ "\n");

        // 여기에 코드를 입력하세요
    }
}
