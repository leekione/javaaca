package com.kh.exam3;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

//    @Override
//    public boolean equals(Object o) {
//        boolean flag = false;
//        if(o instanceof Person){
//            Person p = (Person)o;
//            if (this.name.equals(p.name)) {
//                flag = true;
//            }
//        }
//        return flag;
//    }
//
//    @Override
//    public int hashCode() {
//        System.out.println("hashcode()호출됨!");
//        return Objects.hashCode(name);
//    }

    @Override
    public boolean equals(Object o) {
        System.out.println("equals()호출됨!");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode()호출됨!");
        return Objects.hash(name);
    }
}
