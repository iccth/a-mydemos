package com.example.objectorientedprogramming.abstract_demo;

// 定义一个抽象类Animal
public abstract class Animal {
    protected String name;
    protected int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // 抽象方法，不提供具体实现
    public abstract void sound();
    // 具体方法，提供默认实现
    public void sleep() {
        System.out.println(name + " is sleeping...");
    }
}