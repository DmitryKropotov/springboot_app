package ru.project.training;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logging {

    private final static Logger log = LoggerFactory.getLogger(Logging.class);

    @Pointcut("execution(* ru.project.training.service.impl.StudentServiceImpl.findAll())")
    public void pointcutTest() {
    }


    @Before("pointcutTest()")
    public void logDatabaseInteraction(JoinPoint joinPoint) {
        System.out.println("logDatabaseInteraction in Logging class");
    }
}
