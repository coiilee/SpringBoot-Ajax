package com.kh.AjaxSpringProject.service;

import com.kh.AjaxSpringProject.dto.Person;
import com.kh.AjaxSpringProject.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired //자동 객체 관리
    PersonMapper personMapper;

    @Override
    public List<Person> getAllPerson() {
        return personMapper.getAllPerson();
    }

    @Override
    public Person personDetail(int id) {
        return personMapper.personDetail(id);
    }
}
