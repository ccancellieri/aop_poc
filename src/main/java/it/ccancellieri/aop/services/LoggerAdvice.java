package it.ccancellieri.aop.services;

public interface LoggerAdvice {

    public void logger(String message);
    public void logger(String amessage, Integer message) ;

}
