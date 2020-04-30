package com.luojianhua.controller;

import com.luojianhua.entity.Student;
import com.luojianhua.feign.FeignProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/hystrix")
public class HystrixController {

    @Autowired
    private FeignProvider feignProvider;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
       return feignProvider.findAll();
    }

    @GetMapping("/index")
    public String index(){
        return feignProvider.index();
    }
}
