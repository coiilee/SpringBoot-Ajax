package com.kh.AjaxSpringProject.controller;

import com.kh.AjaxSpringProject.dto.Person;
import com.kh.AjaxSpringProject.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PersonController {

    /**
     * /api/person 주소로
     * DB 에서 가져온 Users 정보를 전달할 것
     */
    @GetMapping("/get/persons")
    public String persons(){
        return "/jQueryAjax/persons";
    }

    @GetMapping("get/persons/detail")
    public String detail(@RequestParam("id")int id){
        return "/jQueryAjax/personDetail";
    }







}
