package com.wdlily.future.user;

import com.wdlily.future.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: WangDi
 * @Date: 2018/1/27 20:44
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public String login(User user) {

        return "666";
    }

    public User insert(User user){

        return userDao.insert(user);
    }

    @Override
    public User findOne(String openId) {
        return userDao.findOne(openId);
    }
}
