package priv.phr.demo.spring.ioc.config;

public class DefaultWheel implements IWheel {
    @Override
    public void rolling() {
        System.out.println("default wheel rolling");
    }

    @Override
    public void stop() {
        System.out.println("default wheel stop rolling");
    }
}
