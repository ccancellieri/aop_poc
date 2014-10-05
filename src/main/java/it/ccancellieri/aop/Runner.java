package it.ccancellieri.aop;

import org.aspectj.lang.annotation.Pointcut;


//@Service("runner")
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Runner {
    
    public void run() {
        test("Start test");
        for (int i = 0; i < 3; i++) {
            test("testing...", i);
        }
    }

    public void test(String amessage, Integer message) throws IllegalArgumentException {
        System.out.println("DOING "+amessage+" with "+message);
        if (message==2){
            throw new IllegalArgumentException("2 is not defined");
        }
    }
    
    public void test(String amessage) {
        System.out.println("---DOING TEST...");
    }

}
