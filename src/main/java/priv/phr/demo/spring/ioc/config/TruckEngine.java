package priv.phr.demo.spring.ioc.config;

public class TruckEngine implements IEngine {
    @Override
    public void run() {
        System.out.println("truck engine start");
    }

    @Override
    public void stop() {
        System.out.println("truck engine stop");
    }
}
