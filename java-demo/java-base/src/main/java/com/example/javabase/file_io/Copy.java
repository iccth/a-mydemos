package com.example.javabase.file_io;

import lombok.SneakyThrows;

import java.io.*;

public class Copy {
    public static void copyFile(String sourcePath, String targetPath, Boolean append) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(sourcePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(targetPath,append))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        }
    }

    @SneakyThrows
    public static void main(String[] args) {
        copyFile("D:\\1\\MyDemos\\java-demo\\java-base\\src\\main\\java\\com\\example\\javabase\\file_io\\test.txt",
                "D:\\1\\MyDemos\\java-demo\\java-base\\src\\main\\java\\com\\example\\javabase\\file_io\\test2.txt", true);
    }
}
