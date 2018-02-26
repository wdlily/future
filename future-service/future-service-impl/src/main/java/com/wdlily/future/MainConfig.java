package com.wdlily.future;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description:
 * @Author: WangDi
 * @Date: 2018/2/26 14:07
 */
@SpringBootApplication
public class MainConfig {

    public static void main(String[] args) {
        SpringApplication.run(MainConfig.class, args);
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
