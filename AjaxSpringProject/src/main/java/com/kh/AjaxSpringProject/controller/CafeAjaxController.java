package com.kh.AjaxSpringProject.controller;

import com.kh.AjaxSpringProject.dto.Cafe;
import com.kh.AjaxSpringProject.service.CafeService;
import com.kh.AjaxSpringProject.service.CafeServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Slf4j
@RestController
public class CafeAjaxController {

    @Autowired
    //AI가 CafeService만 추천하더라도 무조건 실질적 코드가 적혀있는
    //Impl 을 무조건 !!!!!! 붙이기 !!!!!!!
    private CafeServiceImpl cafeService;

    @GetMapping("/api/cafes")
    //CafeServiceImpl.java 파일에
    //getAllCafe() 메서드 자료형으로 List<Cafe>로 작성했기 때문에
    //public 다음에 List<Cafe>가 자료형으로 와야 함
    public List<Cafe> getAllCafes() {
        List<Cafe> cafes = cafeService.getAllCafes();
        log.info("Cafes: {}", cafes); //cafe 데이터가 어떻게 나오는지 백엔드에서 확인 위함
        return cafes;
    }

    @GetMapping("/api/cafes/{id}")
    public Cafe getCafeById(@PathVariable("id") int id){
        return   cafeService.getCafeById(id)  ;
    }
}
