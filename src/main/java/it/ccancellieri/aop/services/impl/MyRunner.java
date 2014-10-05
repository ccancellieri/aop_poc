package it.ccancellieri.aop.services.impl;

import it.ccancellieri.aop.services.IRunner;

//@Service("runner")
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MyRunner implements IRunner, Runnable {

    public void run() {
        test("Start test");
        for (int i = 0; i < 3; i++) {
            test("testing...", i);
        }
    }

    public void test(String amessage, Integer message) throws IllegalArgumentException {
        System.out.println("DOING " + amessage + " with " + message);
        if (message == 2) {
            throw new IllegalArgumentException("2 is not defined");
        }
    }

    public void test(String amessage) {
        System.out.println("---DOING TEST...");
    }

}
