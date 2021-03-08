package com.company.souvcoffee.MS.service.msimpl;

import com.company.souvcoffee.MS.dao.ms.OrdersDAO;
import com.company.souvcoffee.MS.domain.user.Orders;
import com.company.souvcoffee.MS.service.ms.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrdersServiceImpl  implements OrdersService {

    private OrdersDAO ordersDAO;

    @Autowired
    public void setOrdersDAO(OrdersDAO ordersDAO) {
        this.ordersDAO = ordersDAO;
    }

    @Override
    public List<Orders> ordersList() {
        return ordersDAO.ordersList();
    }
}
