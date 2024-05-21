package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String hello(){
        return "Hello"+name;
    }

}