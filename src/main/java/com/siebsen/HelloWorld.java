package com.siebsen;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World.....Non Mirrored");
        HelloWorld hw = new HelloWorld();
        hw.printSomething("some message number 3");
    }

    public void printSomething(String msg) {
        System.out.println(msg);
    }
}
