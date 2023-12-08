package com.example.javabase.service.impl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

    /**
     *  文件写入
     * @param filePath
     * @param content
     * @param append
     * @throws IOException
     */
    public static void writeFile(String filePath, String content, Boolean append) throws IOException {
        try (BufferedWriter out = new BufferedWriter(new FileWriter(filePath, append))) {
            out.write(content);
        }
    }

    public static void main(String[] args) {
        String filePath = "D:\\1\\MyDemos\\java-demo\\java-base\\src\\main\\java\\com\\example\\javabase\\file_io\\test.txt";
        String content = "hello world\n";
        try {
            writeFile(filePath, content, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
