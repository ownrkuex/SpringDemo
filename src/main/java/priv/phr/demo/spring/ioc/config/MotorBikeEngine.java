package priv.phr.demo.spring.ioc.config;

public class MotorBikeEngine implements IEngine {

    @Override
    public void run() {
        System.out.println("motor bike engine start");
    }

    @Override
    public void stop() {
        System.out.println("motor bike engine stop");
    }
}
