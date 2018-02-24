package com.wdlily.future.user;

import com.wdlily.future.entity.User;

/**
 * @Description:
 * @Author: WangDi
 * @Date: 2018/1/27 20:43
 */
public interface UserService {

    public String login(User user);

    User insert(User user);

}
