package com.example.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass {

    @Bean
    @ConditionalOnProperty(value="helloMrBean.enabled", havingValue = "true")
    public PojoClass pojoClass(){
        System.out.println("test");
        return new PojoClass();
    }

}
