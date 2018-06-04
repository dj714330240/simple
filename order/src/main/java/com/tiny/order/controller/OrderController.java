package com.tiny.order.controller;

import com.tiny.order.model.Order;
import com.tiny.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName OrderController
 * @Description TODO
 * @Author Tiny
 * @Date 2018/6/4 14:57
 * @Version 1.0
 */
@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/getOrder")
    @ResponseBody
    public Object getOrder(HttpServletRequest request){
        Order order = orderService.getOrder(Long.valueOf(request.getParameter("id")));
        return  order;
    }

}
