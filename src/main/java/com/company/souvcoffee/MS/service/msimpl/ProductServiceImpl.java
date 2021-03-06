package com.company.souvcoffee.MS.service.msimpl;
import com.company.souvcoffee.MS.dao.ms.ProductDAO;
import com.company.souvcoffee.MS.domain.user.soProduct;
import com.company.souvcoffee.MS.service.ms.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class ProductServiceImpl  implements ProductService {


    ProductDAO productdao;

    @Autowired
    public ProductServiceImpl(ProductDAO productdao) {
        this.productdao = productdao;
    }

    @Override
    public void productList(soProduct product) {
        productdao.productList(product);

    }
}