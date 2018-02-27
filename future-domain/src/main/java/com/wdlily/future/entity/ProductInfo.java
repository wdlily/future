package com.wdlily.future.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.wdlily.future.EnumUtil;
import com.wdlily.future.enums.ProductStatusEnum;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


@Data
public class ProductInfo implements Serializable {

    private String productId;

    /** 名字. */
    private String productName;

    /** 单价. */
    private BigDecimal productPrice;

    /** 库存. */
    private Integer productStock;

    /** 描述. */
    private String productDescription;

    /** 小图. */
    private String productIcon;

    /** 状态, 0正常1下架. */
    private Integer productStatus = ProductStatusEnum.UP.getCode();

    /** 类目编号. */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    @JsonIgnore
    public ProductStatusEnum getProductStatusEnum() {
        return EnumUtil.getByCode(productStatus, ProductStatusEnum.class);
    }
}
