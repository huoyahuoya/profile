package com.example.demo.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"dev","default"})
public class devProfile implements profileTest{

    @Override
    public void configure() {
        System.out.println("devProfile");
    }
}
