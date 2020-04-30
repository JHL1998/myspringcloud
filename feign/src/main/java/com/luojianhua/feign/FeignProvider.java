package com.luojianhua.feign;

import com.luojianhua.entity.Student;
import com.luojianhua.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value="provider",fallback = FeignError.class)

public interface FeignProvider {
    @GetMapping("/student/findAll")
    public Collection<Student>findAll();
    @GetMapping("/student/index")
    public String index();
}
