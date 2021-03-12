package com.company.souvcoffee.MS.controller.menu;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/* 원하는 링크로 갈 수 있는 방법*/
/*https://killsia.tistory.com/entry/Spring-mvc-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-url%EC%97%90-%EB%94%B0%EB%9D%BC-%EC%9B%90%ED%95%98%EB%8A%94-%ED%8E%98%EC%9D%B4%EC%A7%80%EB%A1%9C-%EA%B0%80%EA%B2%8C-%EC%84%A4%EC%A0%95%ED%95%98%EB%8A%94-%EB%B0%A9%EB%B2%95*/
@Controller("menuController")
@RequestMapping("/menu/")
public class MenuConroller {


    @RequestMapping(value = "coffee.do")
    public ModelAndView menuCoffee(ModelAndView mv){
        mv.setViewName("menu/coffee" );
        return mv;
    }

    @RequestMapping(value = "dessert.do")
    public String menuDessert(){
        return "menu/dessert";
    }
    @RequestMapping(value = "tea.do")
    public String menuTea(){
        return "menu/tea";
    }
}
