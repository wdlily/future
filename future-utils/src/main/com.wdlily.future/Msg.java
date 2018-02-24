package com.wdlily.future;

import com.wdlily.future.enums.ResultEnum;
import lombok.Data;

/**
 * @Description:
 * @Author: WangDi
 * @Date: 2018/2/24 17:55
 */
@Data
public class Msg {
    private Msg() {
    }

    private boolean success;
    private String desc;
    private Object data;
    private Integer code;


    public static Msg createSucMsg() {
        return createSucMsg(ResultEnum.SUCCESS);
    }

    public static Msg createSucMsg(Object object) {
        Msg msg = new Msg();
        msg.setSuccess(true);
        msg.setDesc("ok");
        msg.setData(object);
        msg.setCode(0);
        return msg;
    }

    public static Msg createFailMsg(){
        return createFailMsg(ResultEnum.FAIL);
    }

    /**
     * By Enum
     *
     * @param resultEnum
     * @return
     */
    public static Msg createFailMsg(ResultEnum resultEnum) {
        Msg msg = new Msg();
        msg.setSuccess(false);
        msg.setDesc(resultEnum.getMessage());
        msg.setCode(resultEnum.getCode());
        return msg;
    }

    /**
     * By Enum
     *
     * @param resultEnum
     * @return
     */
    public static Msg createSucMsg(ResultEnum resultEnum) {
        Msg msg = new Msg();
        msg.setSuccess(true);
        msg.setDesc(resultEnum.getMessage());
        msg.setCode(resultEnum.getCode());
        return msg;
    }


}
