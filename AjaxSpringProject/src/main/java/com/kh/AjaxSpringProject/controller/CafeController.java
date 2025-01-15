package com.kh.AjaxSpringProject.controller;

import com.kh.AjaxSpringProject.dto.Cafe;
import com.kh.AjaxSpringProject.service.CafeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller

public class CafeController {

    @Autowired
    private CafeService cafeService;

    @GetMapping("/cafe")
    public String cafe() {
        return "cafe";
    }

    //사이트 주소 접근용 !!
    @GetMapping("/cafe/detail/{id}")
    public String detail(@PathVariable int id, Model model) {
        model.addAttribute("cafe",cafeService.getCafeById(id));
        return "cafeList";
    }

}




