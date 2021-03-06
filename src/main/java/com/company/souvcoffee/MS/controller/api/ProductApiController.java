package com.company.souvcoffee.MS.controller.api;


import com.company.souvcoffee.MS.domain.user.Orders;
import com.company.souvcoffee.MS.domain.user.Product;
import com.company.souvcoffee.MS.service.ms.OrdersService;
import com.company.souvcoffee.MS.service.ms.ProductService;
import config.log4j2.Log4j2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//RestController => json 값 주고 받기 , 객체 자체를 반환 해도 제이슨으로 출력해줌
//@ResponseBody가 들어온것같은 효과를 준다고한다 ->이름을 지정해야 된다. 안그러면 일반 컨트롤러랑 충돌 남(아래 추가 설명) .
// 그리고  sitemesh3에서 예외처리 했음
@RestController("apiProductController")
@RequestMapping("api/product/")
//@Component("productService")   //@ Component() < 여기 안에 인터페이스 넣음, 그럼 bean생성
// IoC 컨테이너에서 여기에 담길 때 QueryController  queryController  = new QueryController // 소문자로 변환해 키값으로 사용
// 빈으로 설정 시 <bean id= "QueryController" class ="....QueryController">
// 빈설정을 할 때 패키지가 비슷하다면 (또는 같지만 컨트롤러에서 갈라진다던가)
// 식별자를 지정해줘야 servlet.xml(component-scan base-package)에서 모호하지 않는다
//그렇기 때문에 @RestController에 식별자(이름)을 붙여주면 된다
public class ProductApiController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(Log4j2.class);


    @RequestMapping("prolist.do")
    public List<Product> productList(){

        return productService.productList();
    }


    @RequestMapping("list.do")
    public String list(){
System.out.println("what");
        return "notice list";
    }

 }
