package com.example.javabase.service.impl;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

@Service
public class FileIOService implements com.example.javabase.service.FileIO {

    //读取文件内容
    public static String readFile(String filePath) throws IOException {
        StringBuilder sb = new StringBuilder();
        try(BufferedReader in = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line=in.readLine())!=null){
                sb.append(line).append(System.lineSeparator());
            }
        }
        return sb.toString();
    }

    //判断文件是否存在
    public static boolean fileExists(String filePath){
        return new File(filePath).exists();
    }

    //在指定目录创建文件
    public static void createFileInFolder(String filePath) throws IOException {
        File file = null;
        File dir = new File(filePath);
        file = File.createTempFile("JavaTemp",".javaTemp",dir);
        System.out.println(file.getPath());
    }
}
