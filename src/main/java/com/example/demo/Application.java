package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        MyConfiguration_Value myConfiguration_Value = context.getBean(MyConfiguration_Value.class);
        System.out.println(myConfiguration_Value.toString());

        MyConfiguration_Properties myConfiguration_Properties = context.getBean(MyConfiguration_Properties.class);
        System.out.println(myConfiguration_Properties.toString());

        context.close();
    }
}
