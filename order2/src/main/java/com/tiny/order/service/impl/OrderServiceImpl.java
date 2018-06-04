package com.tiny.order.service.impl;

import com.tiny.order.model.Order;
import com.tiny.order.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * @ClassName OrderServiceImpl
 * @Description TODO
 * @Author Tiny
 * @Date 2018/6/4 14:53
 * @Version 1.0
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public Order getOrder(Long id) {
        Order order = new Order();
        order.setId(id);
        order.setUserId(id*2-1);
        order.setCentent("内容"+"222222");
        return order;
    }
}
