package com.wdlily.future.order;

import com.wdlily.future.entity.OrderMaster;
import com.wdlily.future.mapper.OrderMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: WangDi
 * @Date: 2018/2/27 14:21
 */
@Service("orderMasterService")
public class OrderMasterImpl implements OrderMasterService {

    @Autowired
    private OrderMasterRepository orderMasterRepository;
    @Override
    public int insert(OrderMaster orderMaster) {
        return orderMasterRepository.insert(orderMaster);
    }
}
