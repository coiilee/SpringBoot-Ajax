package com.kh.AjaxSpringProject.controller;

import com.kh.AjaxSpringProject.dto.Cafe;
import com.kh.AjaxSpringProject.service.CafeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
    }




