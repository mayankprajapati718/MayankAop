package com.example.mayankaop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class ProjectConfig {
    @Bean
    public LogAspect logAspect(){
        return new LogAspect();
    }
}
