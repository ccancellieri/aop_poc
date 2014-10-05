package it.ccancellieri.aop.services.impl;

import it.ccancellieri.aop.services.LoggerAdvice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggerAdviceImpl implements LoggerAdvice {

    @Before("execution(public void it.ccancellieri.aop..*(*)) && args(message)")
    public void logger(String message) {
        System.out.println("LOGGING MESSAGE: " + message);
    }

    @Override
    @Before("execution(public void it.ccancellieri.aop..*(..)) && args(amessage,message)")
    public void logger(String amessage, Integer message) {
        System.out.println("LOGGING A MESSAGE: " + amessage + " FOR: "+message);
    }
    
    @AfterThrowing(pointcut="execution(public * it.ccancellieri.aop.Runner.*(..))", throwing="e")
    public void afterThrowing(JoinPoint jp, IllegalArgumentException e) throws IllegalArgumentException {
        System.out.println("LOGGING ERROR SIGN:"+jp.getSignature()+" MESSAGE:"+e.getLocalizedMessage());
    }

}
