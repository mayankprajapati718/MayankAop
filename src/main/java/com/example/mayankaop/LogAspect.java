package com.example.mayankaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.logging.Logger;

@Aspect
public class LogAspect {private Logger logger=Logger.getLogger(LogAspect.class.getName());
    @Around("execution(* com.example.mayankaop.LoginService.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable{
        joinPoint.proceed();
        logger.info("login method was executed");
        }

    }
