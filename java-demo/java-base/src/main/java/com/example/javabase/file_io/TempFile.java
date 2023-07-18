package com.example.javabase.file_io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TempFile {

    /**
     *  创建临时文件
     */
    public  static  void createTempFile(String content) throws IOException {
        File temp = File.createTempFile("TempFile",".txt");
        System.out.println("文件路径: "+temp.getAbsolutePath());
        temp.deleteOnExit();
        BufferedWriter out = new BufferedWriter(new FileWriter(temp));
        out.write(content);
        System.out.println("临时文件已创建.");
        out.close();
    }

}
