package com.example.javabase.service.impl;

import java.io.File;
import java.io.IOException;

public class Rename {
    public static void main(String[] args) throws IOException {
        File oldName =new File("D:\\1\\MyDemos\\java-demo\\java-base\\src\\main\\java\\com\\example\\javabase\\file_io\\test.txt");
        File newName =new File("D:\\1\\MyDemos\\java-demo\\java-base\\src\\main\\java\\com\\example\\javabase\\file_io\\test-r.txt");
        if (newName.exists()) {
            throw new java.io.IOException("文件已存在!");
        }
        if (oldName.renameTo(newName)) {
            System.out.println("重命名成功!");
        } else {
            System.out.println("重命名失败!");
        }
    }
}
