package it.ccancellieri.aop;

import it.ccancellieri.aop.services.impl.MyRunner;

import org.aspectj.lang.JoinPoint;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@EnableAspectJAutoProxy
//@EnableLoadTimeWeaving
//@ComponentScan(basePackages={"it.ccancellieri.aop"})
public class MainExample {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        MyRunner runner = ctx.getBean("runner", MyRunner.class);

        Thread t = new Thread(runner);
        t.start();

        t.join();

        ctx.close();
    }
}
