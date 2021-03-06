package com.company.souvcoffee.MS.controller.api;


import com.company.souvcoffee.config.log4j2.Log4j2;
import com.company.souvcoffee.MS.service.ms.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("apiNoticeController") //@ResponseBody가 들어온것같은 효과를 준다고한다
@RequestMapping("api/notice/")
@Component("productService")   //@ Component() < 여기 안에 인터페이스 넣음, 그럼 bean생성
// IoC 컨테이너에서 여기에 담길 때 QueryController  queryController  = new QueryController // 소문자로 변환해 키값으로 사용
// 빈으로 설정 시 <bean id= "QueryController" class ="....QueryController">
// 빈설정을 할 때 패키지가 비슷하다면 (또는 같지만 컨트롤러에서 갈라진다던가)
// 식별자를 지정해줘야 servlet.xml(component-scan base-package)에서 모호하지 않는다
//그렇기 때문에 @RestController에 식별자(이름)을 붙여주면 된다
public class QueryController {



    



    private final ProductService productService;


    @Autowired(required = false) //AutoWired 연결 안된 상태 , 위에 component에서 직접 주입중이라 그럼.
    //@Qualifier("product2") // product2로만 받겠다
    public QueryController(ProductService productService) {
        this.productService = productService;
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(Log4j2.class);

/*

    @RequestMapping("productList.do")
    public  List<soProduct> productList(soProduct product){

        List<soProduct> productList = productService.getList();
        return productList;
    }
*/


    @RequestMapping("list.do")
    public String list(){
System.out.println("what");
        return "notice list";
    }



 }
