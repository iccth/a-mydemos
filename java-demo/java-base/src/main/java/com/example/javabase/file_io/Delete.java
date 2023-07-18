package com.example.javabase.file_io;

import java.io.File;

public class Delete {
    public static boolean deleteFile(String filePath) {
        File file = new File(filePath);
        if (file.exists()) {
            return file.delete();
        } else {
            System.out.println("文件不存在！");
            return false;
        }
    }

    public static void main(String[] args) {
        deleteFile("D:\\1\\MyDemos\\java-demo\\java-base\\src\\main\\java\\com\\example\\javabase\\file_io\\test.txt");
    }
}
