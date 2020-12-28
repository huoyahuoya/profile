package com.example.demo;


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
    @Value("${com.example.demo.name:boot}")
    private String name;

    @Value("${com.example.demo.version:0.0.0}")
    private String version;

    @Value("${com.example.demo.listName:null}")
    private List<String> listName;

    @Value("${com.example.demo.index:null}")
    private List<String> index;

//    @Override
//    public String toString() {
//        return "MyConfiguration_Value [name=" + name + ", version=" + version + ", listName=" + listName + "]";
//    }
}
