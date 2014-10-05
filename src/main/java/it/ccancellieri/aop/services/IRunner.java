package it.ccancellieri.aop.services;


public interface IRunner {

    public abstract void test(String amessage, Integer message) throws IllegalArgumentException;
    
    public abstract void test(String amessage);

}
