package com.wdlily.future.controller.user;

import com.wdlily.future.Msg;
import com.wdlily.future.entity.User;
import com.wdlily.future.user.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: WangDi
 * @Date: 2018/1/18 12:53
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("login")
    public String login(User user){

        log.info("【用户登录】userName={}, checkCode={}", "admin", "superAdmin");

        String login = userService.login(user);

        return login;
    }

    @GetMapping("/save")
    @ResponseBody
    public Msg save(User user){

        User insert = userService.insert(user);

        return Msg.createSucMsg(insert);
    }



}
