package it.ccancellieri.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//@EnableAspectJAutoProxy
//@EnableLoadTimeWeaving
//@ComponentScan(basePackages={"it.ccancellieri.aop"})
public class MainExample {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        
        Runner runner = ctx.getBean("runner", Runner.class);
         
        runner.run();
         
        ctx.close();
    }
}
