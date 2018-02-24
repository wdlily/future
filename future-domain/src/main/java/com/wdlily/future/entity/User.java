package com.wdlily.future.entity;

import lombok.Data;

/**
 * @Description: 用户实体
 * @Author: WangDi
 * @Date: 2018/2/24 14:31
 */
@Data
public class User {

    /**
     * openId
     */
    private String openId;

    /**
     * unionId
     */
    private String unionId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 头像Url
     */
    private String avatarUrl;

    /**
     * 性别 0男 1 女
     */
    private Integer sex;

    /**
     * 电话
     */
    private String phone;

    /**
     * 住址
     */
    private String address;

    /**
     * 邮箱
     */
    private String email;

}
