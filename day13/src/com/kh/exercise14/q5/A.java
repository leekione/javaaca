package com.kh.exercise14.q5;

class A implements AutoCloseable{
    String res = "리소스 할당";
    @Override
    public void close() throws Exception {
        res = null;
        System.out.println("리소스 자동 해제");
    }
}
