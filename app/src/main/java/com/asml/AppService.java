package com.asml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application-${profile}.properties")
public class AppService {

    @Value("${s1}")
    private String s1;
    @Value("${s2}")
    private String s2;

    public void testing(){
        System.out.println(s1);
        System.out.println(s2);
    }
}
