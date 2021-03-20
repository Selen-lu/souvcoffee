package com.company.souvcoffee.MS.controller.wishbox;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("wishbox")
public class WishboxController {

    @RequestMapping("/wishbox.do")
    public String wishboxList(){
        return "wishbox/wishbox";
    }
}
