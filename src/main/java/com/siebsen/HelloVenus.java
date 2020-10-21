package com.siebsen;

public class HelloVenus {
    public static void main(String[] args) {
        System.out.println("Hello WVebus");
        HelloWorld hw = new HelloWorld();
        hw.printSomething("some message number 3");
    }

    public void printSomethingElse(String msg) {
        System.out.println(msg);
    }
}
