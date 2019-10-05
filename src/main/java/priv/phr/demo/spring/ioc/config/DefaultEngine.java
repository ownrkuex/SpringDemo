package priv.phr.demo.spring.ioc.config;

public class DefaultEngine implements IEngine {
    @Override
    public void run() {
        System.out.println("default engine start");
    }

    @Override
    public void stop() {
        System.out.println("default engine stop");
    }
}
