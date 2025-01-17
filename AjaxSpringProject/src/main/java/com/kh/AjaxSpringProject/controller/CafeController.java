package com.kh.AjaxSpringProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CafeController {


    @GetMapping("/cafe")
    public String cafe() {
        return "/jQueryAjax/cafe";
    }

    //사이트 주소 접근용 !!
    @GetMapping("cafe/detail")
    public String detail(@RequestParam("id") int id) {
        return "/jQueryAjax/cafeList";
    }

}




