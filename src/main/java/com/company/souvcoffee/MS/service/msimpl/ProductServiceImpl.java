package com.company.souvcoffee.MS.service.msimpl;
import com.company.souvcoffee.MS.dao.ms.ProductDAO;
import com.company.souvcoffee.MS.domain.user.Orders;
import com.company.souvcoffee.MS.domain.user.Product;
import com.company.souvcoffee.MS.service.ms.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class ProductServiceImpl  implements ProductService {


   private ProductDAO productdao;

    @Autowired
    public void setProductdao(ProductDAO productdao) {
        this.productdao = productdao;
    }

    @Override
    public List<Product> productList() {
       return  productdao.productList();

    }

}