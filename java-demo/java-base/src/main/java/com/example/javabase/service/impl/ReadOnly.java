package com.example.javabase.service.impl;

import java.io.File;

public class ReadOnly {
    public static void main(String[] args) {
        File file = new File("D:\\1\\MyDemos\\java-demo\\java-base\\src\\main\\java\\com\\example\\javabase\\file_io\\test.txt");
        System.out.println(file.setReadOnly());
        System.out.println(file.canWrite());
    }
}
