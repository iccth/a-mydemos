package com.example.javabase;

import com.example.javabase.service.impl.FileIOService;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FileIOTests {
    @SneakyThrows
    @Test
    void testReadFile() {
        String path = "D:\\1\\MyDemos\\java-demo\\java-base\\src\\main\\java\\com\\example\\javabase\\service\\impl\\test.txt";
        String content = FileIOService.readFile(path);
        System.out.println(content);
    }

    @Test
    void testFileExist() {
        boolean exist = FileIOService.fileExists("D:\\1\\MyDemos\\java-demo\\java-base\\src\\main\\java\\com\\example\\javabase\\service\\impl\\test.txt");
        System.out.println(exist);
    }

    @SneakyThrows
    @Test
    void testCreateFileInFoler(){
        FileIOService.createFileInFolder("D:\\1\\MyDemos\\java-demo\\java-base\\src\\main\\java\\com\\example\\javabase\\service\\impl");

    }
}
