package com.wdlily.future.enums;


import lombok.Getter;

/**
 * @Description:
 * @Author: WangDi
 * @Date: 2018/2/24 17:56
 */
@Getter
public enum ResultEnum {

    FAIL(-1, "fail"),

    SUCCESS(0, "ok"),




    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
