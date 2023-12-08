package com.example.objectorientedprogramming.abstract_demo;

// 测试代码
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Bobby", 3);
        dog.sound(); // 输出：Bobby is barking...
        dog.sleep(); // 输出：Bobby is sleeping...
        Animal cat = new Cat("Whiskers", 5);
        cat.sound(); // 输出：Whiskers is meowing...
        cat.sleep(); // 输出：Whiskers is sleeping...
    }
}