package com.kh.AjaxSpringProject.dto;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Cafe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
    private String phoneNumber;
    private String openingTime;
    private String closingTime;
    private String description;



}
