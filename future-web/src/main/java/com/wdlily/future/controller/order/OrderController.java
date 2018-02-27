package com.wdlily.future.controller.order;

import com.wdlily.future.KeyUtil;
import com.wdlily.future.Msg;
import com.wdlily.future.entity.OrderMaster;
import com.wdlily.future.enums.OrderStatusEnum;
import com.wdlily.future.enums.PayStatusEnum;
import com.wdlily.future.order.OrderMasterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @Description:
 * @Author: WangDi
 * @Date: 2018/2/27 14:23
 */
@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {


    @Autowired
    private OrderMasterService orderMasterService;


    @GetMapping("/create")
    public Msg save(){

        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId(KeyUtil.genUniqueKey());
        orderMaster.setBuyerAddress("深圳碧海湾");
        orderMaster.setBuyerName("鹏鹏");
        orderMaster.setBuyerOpenid("openId00010");
        orderMaster.setBuyerPhone("123456");
        orderMaster.setOrderAmount(new BigDecimal(1235));
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());

        int insert = orderMasterService.insert(orderMaster);

        log.info("【创建订单】保存成功的数据条数 = {}", insert);

        return Msg.createSucMsg(orderMaster);
    }


}
