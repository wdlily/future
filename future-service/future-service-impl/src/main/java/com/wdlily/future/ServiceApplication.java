package com.wdlily.future;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @Description:
 * @Author: WangDi
 * @Date: 2018/2/26 14:07
 */
@SpringBootApplication
@ServletComponentScan
@MapperScan("com.wdlily.future.mapper")
public class ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
