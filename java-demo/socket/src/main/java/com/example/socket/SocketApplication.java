package com.example.socket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.net.Socket;

@SpringBootApplication
public class SocketApplication {

    public static void main(String[] args) {
        SpringApplication.run(SocketApplication.class, args);
    }

    @PostConstruct
    public void init() {
        // 在这里执行初始化操作
        System.out.println("项目启动时执行的初始化操作");
        new SocketServer();
    }

}
