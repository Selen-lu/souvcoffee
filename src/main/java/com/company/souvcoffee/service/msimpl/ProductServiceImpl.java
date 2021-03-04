package com.company.souvcoffee.service.msimpl;

import com.company.souvcoffee.dao.ms.ProductDAO;
import com.company.souvcoffee.domain.ms.soProduct;
import com.company.souvcoffee.service.ms.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImpl  implements ProductService {



    private final ProductDAO productDAO;

    @Autowired
    public ProductServiceImpl(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }


    @Override
    public List<soProduct> getAll() {
        return productDAO.getAll();
    }
}
