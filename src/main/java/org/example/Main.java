package org.example;

public class Main {
    public void test() {
        System.out.println(getClass().getResource("test.properties").getPath());
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        Main main = new Main();
        main.test();
    }
}
