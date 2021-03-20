package com.company.souvcoffee.MS.controller.search;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("search")
public class SearchController {


    @RequestMapping("/search.do")
    public String UserLogin(){
        return "search/search";
    }

}
