package com.company.souvcoffee.MS.controller;


import com.company.souvcoffee.MS.domain.soProduct;
import com.company.souvcoffee.log4j2.Log4j2;
import com.company.souvcoffee.MS.service.ms.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/* http://blog.naver.com/PostView.nhn?blogId=papercut01&logNo=220357664822 */


@RestController
public class QueryController {


    private final ProductService productService;

    public QueryController(ProductService productService) {
        this.productService = productService;
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(Log4j2.class);

    @RequestMapping("/api")
    public String productList(soProduct product){

        productService.productList(product);
        return productList(product);
    }



}
