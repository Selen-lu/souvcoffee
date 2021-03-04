package com.company.souvcoffee.controller.rest;

import com.company.souvcoffee.domain.ms.soProduct;
import com.company.souvcoffee.service.ms.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/* http://blog.naver.com/PostView.nhn?blogId=papercut01&logNo=220357664822 */
@RestController
public class QueryController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }



    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public List<soProduct> productList() {
        System.out.println("hi");
        System.out.println(productService.getAll());
        return productService.getAll();
    }

}
