package com.example.javabase.file_io;

import java.io.File;

public class FileSize {
    public static long getFileSize(String filePath) {
        File file = new File(filePath);
        if (!file.exists() || !file.isFile()) {
            System.out.println("文件不存在!");
            return -1;
        }
        return file.length();
    }

    public static void main(String[] args) {
        System.out.println(getFileSize("D:\\1\\MyDemos\\java-demo\\java-base\\src\\main\\java\\com\\example\\javabase\\file_io\\test.txt")+" bytes");
    }
}
