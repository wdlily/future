package com.wdlily.future.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;


@Data
public class OrderDetail implements Serializable {

    private String detailId;

    /** 订单id. */
    private String orderId;

    /** 商品id. */
    private String productId;

    /** 商品名称. */
    private String productName;

    /** 商品单价. */
    private BigDecimal productPrice;

    /** 商品数量. */
    private Integer productQuantity;

    /** 商品小图. */
    private String productIcon;
}
