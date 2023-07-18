package com.example.javabase.file_io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class LastModifiedDate {
    public  static String changeLastModifiedDate(String filePath) throws IOException {
        File fileToChange = new File(filePath);
        fileToChange.createNewFile();

        Date fileTime = new Date(fileToChange.lastModified());
        //System.out.println(fileTime.toString());

        System.out.println(fileToChange.setLastModified(System.currentTimeMillis()));

        fileTime=new Date(fileToChange.lastModified());
        String fileTimeStr = fileTime.toString();
        //System.out.println(fileTimeStr);
        return fileTimeStr;
    }

    public static void main(String[] args) {
        try {
            changeLastModifiedDate("D:\\1\\MyDemos\\java-demo\\java-base\\src\\main\\java\\com\\example\\javabase\\file_io\\test.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
