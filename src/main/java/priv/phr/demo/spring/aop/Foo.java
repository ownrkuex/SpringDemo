package priv.phr.demo.spring.aop;

import java.time.temporal.ChronoUnit;

public class Foo {

    @LogExecTime
    public void foo1() throws InterruptedException {
        System.out.println("inside foo1");
        Thread.sleep(2000);
    }

    @LogExecTime(format = "yyyy/MM/dd-HH:mm:ss")
    public void foo2() throws InterruptedException {
        System.out.println("inside foo2");
        Thread.sleep(2000);
    }

    @LogExecTime
    public String sayHello() throws InterruptedException {
        System.out.println("inside sayHello");
        Thread.sleep(1000);
        return "hello aop";
    }
}
