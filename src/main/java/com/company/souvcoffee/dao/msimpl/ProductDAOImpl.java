package com.company.souvcoffee.dao.msimpl;

import com.company.souvcoffee.dao.ms.ProductDAO;
import com.company.souvcoffee.domain.ms.soProduct;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class ProductDAOImpl implements ProductDAO {
    final String MS_NAME_SPACE = "com.company.souvcoffee.dao.ms.ProductDAO";

    private final SqlSessionTemplate sqlSessionTemplate;

    
    // Qualifier => Autowired 랑 같이 자동의존성 주입해주는 태그이나 , 의존성을 선택하게 해준다는 점이 다름
    @Autowired
    public ProductDAOImpl(@Qualifier("sqlSession") SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<soProduct> getAll() {
        return sqlSessionTemplate.selectList(MS_NAME_SPACE+".productList");
    }
}
