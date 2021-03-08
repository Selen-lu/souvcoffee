package com.company.souvcoffee.MS.controller.api;

import com.company.souvcoffee.MS.domain.user.Orders;
import com.company.souvcoffee.MS.service.ms.OrdersService;
import com.company.souvcoffee.MS.service.ms.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("apiOrdersController")
@RequestMapping("api/orders/")
public class OrdersApiController {


    private OrdersService ordersService;

    @Autowired
    public void setOrdersService(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    @RequestMapping("orderslist.do")
    public List<Orders> ordersList(){

        return ordersService.ordersList();
    }
}
