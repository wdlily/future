package com.wdlily.future.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: WangDi
 * @Date: 2018/1/18 12:53
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @GetMapping("login")
    public String login(){
        return "login success";
    }



}
