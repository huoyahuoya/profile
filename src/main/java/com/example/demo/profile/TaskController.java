package com.example.demo.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TaskController {

    @Autowired
    profileTest profiletest ;

    @RequestMapping(value = {"/task",""})
    public void hellTask(){
        profiletest.configure(); //最终打印testdb
    }
}
