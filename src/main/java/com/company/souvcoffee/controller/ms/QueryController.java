package com.company.souvcoffee.controller.ms;

import com.company.souvcoffee.domain.ms.soProduct;
import com.company.souvcoffee.service.ms.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("query")
public class QueryController {



    private ProductService productService;


    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }



    @RequestMapping(value = "query.qu", method = RequestMethod.GET)
    public List<soProduct> productList() {
        System.out.println("what");
        return productService.getAll();
    }

}
