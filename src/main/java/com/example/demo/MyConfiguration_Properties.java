package com.example.demo;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Getter
@Setter
@ToString
@ConfigurationProperties(prefix="com.example.demo")
public class MyConfiguration_Properties {

    private String name;

    private String version;

    private List<String> listName;

    private List<String> index;

}
