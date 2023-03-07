package com.example.mayankaop;

import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

@Service
public class LoginService {
    private Logger logger=Logger.getLogger(LoginService.class.getName());
    public void loginservice(Security login)  {
        String value="\nUsername: "+login.getUsername()+"\nPassword: "+login.getPassword();
        logger.info(value);try(FileWriter fileWriter=new FileWriter("Login.txt")){
        fileWriter.write(value);


    }catch (IOException E){}}}
