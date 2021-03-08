package com.company.souvcoffee.MS.dao.msimpl;

import com.company.souvcoffee.MS.dao.ms.OrdersDAO;
import com.company.souvcoffee.MS.domain.user.Orders;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrdersDAOImpl implements OrdersDAO {

    final String order_NAME_SPACE ="com.company.souvcoffee.ordersMapper";

    private SqlSessionTemplate sqlsession1;



    @Autowired
    public void setSqlsession1(@Qualifier("sqlSession") SqlSessionTemplate sqlsession1) {
        this.sqlsession1 = sqlsession1;
    }

    @Override
    public List<Orders> ordersList() {
        return   sqlsession1.selectList(order_NAME_SPACE+".ordersList");
    }
}
