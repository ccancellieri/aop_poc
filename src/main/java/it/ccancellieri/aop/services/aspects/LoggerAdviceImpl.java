package it.ccancellieri.aop.services.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggerAdviceImpl {

    @Before("execution(public void it.ccancellieri.aop.services.IRunner.*(*)) && args(message)")
    public void logger(String message) {
        System.out.println("LOGGING MESSAGE: " + message);
    }

    @Before("execution(public void it.ccancellieri.aop.services.IRunner.*(..)) && args(amessage,message)")
    public void logger(String amessage, Integer message) {
        System.out.println("LOGGING A MESSAGE: " + amessage + " FOR: "+message);
    }
    
    @AfterThrowing(pointcut="execution(public * it.ccancellieri.aop.services.IRunner.*(..))", throwing="e")
    public void afterThrowing(JoinPoint jp, IllegalArgumentException e) throws IllegalArgumentException {
        System.out.println("LOGGING ERROR SIGN:"+jp.getSignature()+" MESSAGE:"+e.getLocalizedMessage());
    }
    
//    @Around("execution(* logger(String, Integer)) && args(amessage,message)")
//    public void dynamicAround(JoinPoint jp, String amessage, Integer message) {
//        System.out.println("---------AROUND--------");
//        (jp.getTarget())
//        System.out.println("LOGGING DYNAMICALLY ERROR SIGN:"+jp.getSignature()+" MESSAGE:"+e.getLocalizedMessage());
//    }

}
