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
    public void findAllPointcut() {
    }

    @Pointcut("execution(* ru.project.training.service.impl.StudentServiceImpl.*(..))")
    public void studentSeviceImplPointcut() {
    }

    @Pointcut("within(ru.project.training..*)")
    public void withinPointcut() {
    }

    @Pointcut("target(ru.project.training.service.impl.StudentServiceImpl)")
    public void targetPointcut() {
    }

    @Pointcut("this(ru.project.training.service.StudentService)")
    public void thisPointcut() {
    }


    @Before("findAllPointcut()")
    public void adviceOne(JoinPoint joinPoint) {
        System.out.println("findAllPointcut");
    }

    @Before("studentSeviceImplPointcut()")
    public void adviceTwo(JoinPoint joinPoint) {
        System.out.println("studentSeviceImplPointcut");
    }

    @Before("withinPointcut()")
    public void adviceWithin() {
        System.out.println("adviceWithin pointcut");
    }

    @Before("targetPointcut()")
    public void adviceTarget() {
        System.out.println("targetPointcut pointcut");
    }

    @Before("thisPointcut()")
    public void adviceThis() {
        System.out.println("thisPointcut pointcut");
    }
}
