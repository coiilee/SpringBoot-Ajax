package com.kh.AjaxSpringProject.controller;

import com.kh.AjaxSpringProject.dto.User;
import com.kh.AjaxSpringProject.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Slf4j //Lombok에서 지원하는 log = 기록
@RestController
public class AjaxController {

    @Autowired
    private UserService userService;

    @GetMapping("/api/users")
    public List<User> getAllUsers(){
        List<User>users = userService.getAllUsers();
        log.info(users.toString());//데이터의 정보가 어떻게 나오는지 확인하는 info
        System.out.println(users);
        return users;
    }

    //id = 유동적으로 사용자가 선택하는 id값으로 변경
    //jQuery {}를 사용해서 변수 이름이나 특정 값을 가져옴
    //controller는 {}만 사용해도 가능
    //@PathVariable("id") int id @GetMapping에서 {id}값을 바라봄
    @GetMapping("/api/user/{id}")
    public User getUserById(@PathVariable("id") int id){
        User user = userService.getUserById(id);
        log.info(user.toString());
        return user;
    }

    @GetMapping("/api/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/api/data")
    public Map<String,String>data(){
        Map<String,String>map = new HashMap<>();
        map.put("msg","hello");
        map.put("status","200");
        return map;
    }

}
