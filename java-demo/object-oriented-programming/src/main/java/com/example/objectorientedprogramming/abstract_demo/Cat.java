package com.example.objectorientedprogramming.abstract_demo;

// 具体类Cat继承自Animal
public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }
    // 实现抽象方法sound()
    @Override
    public void sound() {
        System.out.println(name + " is meowing...");
    }
}
