package com.company.souvcoffee.MS.controller.topnav;


import config.log4j2.Log4j2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Locale;


// 인터셉트 하는거라 이 링크를 보고 다시 : log4j2
// https://addio3305.tistory.com/43



@Controller("MainController")
@RequestMapping("/*.do")
public class MainController {
    private static final Logger LOGGER = LoggerFactory.getLogger(Log4j2.class);

/*

    private ProductService productService;


    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }
*/


/*
    *//* sevlet base package와 연관 o*//*
    private ProductService productService;


    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }*/

// [web/WEB-INF/views/decorators/main.jsp]이(가) "/" 문자로 시작하지 않습니다. == sitemesh3.xml path와 이름이 같나, 아니면 들어가는 단어가 있나 확인 필요
    //  [/]main , []main < 두가지 경로를 다르게 파악하니 이것도 주의 / [/] 도 경로로 포함하나 안하나 차이

    // 기본으로 [/] 는 main이 가져가고
    // 그 뒤로 /+user < 이렇게 쌓는 느낌으로 간다고 생각하면 된다.
    //[/]가  main으로 가게 하는 설정은 sitemesh3.xml에서 했다
    @RequestMapping(value = {"/main.do"} ,method = RequestMethod.GET)
    public ModelAndView main(ModelAndView mv){
        System.out.println("Main 입니다 ");
        //기본 패키지 : web/~/~/~
        mv.setViewName("user/main");
        return mv;
    }


    @RequestMapping(value = "/about.do", method = RequestMethod.GET)
    public String about(Locale locale) {
        LOGGER.info("Welcome home! The client locale is {}.", locale);
        return "user/about";
    }


    @RequestMapping(value = "/visit.do", method = RequestMethod.GET)
    public String service(Locale locale) {
        LOGGER.info("Welcome home! The client locale is {}.", locale);
        return "user/visit";
    }

    @RequestMapping(value = "/menu.do", method = RequestMethod.GET)
    public String portfolio(Locale locale) {
        LOGGER.info("Welcome home! The client locale is {}.", locale);
        return "user/menu";
    }

    @RequestMapping(value = "/goods.do", method = RequestMethod.GET)
    public String user(Locale locale) {
        LOGGER.info("Welcome home! The client locale is {}.", locale);
        return "user/goods";
    }
    @RequestMapping(value = "/contact.do", method = RequestMethod.GET)
    public String contact(Locale locale) {
        LOGGER.info("Welcome home! The client locale is {}.", locale);
        return "user/contact";


    }




}
