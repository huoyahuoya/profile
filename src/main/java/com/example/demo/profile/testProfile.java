package com.example.demo.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
//@Service
@Profile("test")
public class testProfile implements profileTest{

    @Override
    public void configure() {
        System.out.println("testProfile");
    }
}
