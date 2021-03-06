package com.company.souvcoffee.MS.dao.msimpl;

import com.company.souvcoffee.MS.dao.ms.ProductDAO;
import com.company.souvcoffee.MS.domain.soProduct;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;


@Repository
public class ProductDAOImpl implements ProductDAO {

    final String MS_NAME_SPACE = "com.company.souvcoffee.productMapper";



    private SqlSessionTemplate sqlsession;


    @Autowired
    public ProductDAOImpl(@Qualifier("sqlSession") SqlSessionTemplate sqlsession) {
        this.sqlsession = sqlsession;
    }

    @Override
    public void productList(soProduct product) {

        sqlsession.selectOne(MS_NAME_SPACE+".productList",product);
    }
}
