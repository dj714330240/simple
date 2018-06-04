package com.tiny.cases.controller;

import com.tiny.cases.model.Order;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName CaseController
 * @Description TODO
 * @Author Tiny
 * @Date 2018/6/4 15:10
 * @Version 1.0
 */

@RequestMapping(value = "/case")
@RestController
@EnableSwagger2
public class CaseController {


    @Autowired
    RestTemplate restTemplate;

    @ApiOperation(value = "查找一个订单s")
    @GetMapping(value =  "/getOrder")
    @ResponseBody
    public Object getOrder(@ApiParam(value = "订单id")HttpServletRequest request){
        Order order = restTemplate.getForObject("http://service-order/order/getOrder?id=2",Order.class);
        return  order;
    }

}
