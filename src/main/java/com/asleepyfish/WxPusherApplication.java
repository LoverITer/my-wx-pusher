package com.asleepyfish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.asleepyfish.annotation.EnableChatGPT;


@SpringBootApplication
@EnableChatGPT
public class WxPusherApplication {
    public static void main(String[] args) {
        SpringApplication.run(WxPusherApplication.class, args);
    }
}
