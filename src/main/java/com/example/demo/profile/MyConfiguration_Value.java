package com.example.demo.profile;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@ToString
@Component
public class MyConfiguration_Value {

    //@Value默认要有配置项，配置项可以为空，若没有配置项要指定默认值，:后的boot为默认值
    @Value("${com.example.demo.profile.name:boot}")
    private String name;

    @Value("${com.example.demo.profile.version:0.0.0}")
    private String version;

    @Value("${com.example.demo.profile.listName:null}")
    private List<String> listName;

    @Value("${com.example.demo.profile.index:null}")
    private List<String> index;

    @Value("${com.example.demo.profile.index:null}")
    private String profiles;

}
