package com.example.mayankaop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var service = context.getBean(LoginService.class);
 Security login=new Security();
  login.setUsername("MayankPrajapati");
  login.setPassword("166718");
   service.loginservice(login);
    }
}