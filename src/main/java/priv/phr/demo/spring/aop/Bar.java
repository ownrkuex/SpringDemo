package priv.phr.demo.spring.aop;

@LogExecTime
public class Bar {

    public void bar1() throws InterruptedException {
        System.out.println("inside bar1");
        Thread.sleep(3000);
    }
}
