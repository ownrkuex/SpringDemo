package priv.phr.demo.spring.ioc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Truck implements ICar {

    private IEngine engine;

    // autowire by name
    // constructor autowire
    @Autowired
    public Truck(@Qualifier("truckEngine") IEngine engine) {
        this.engine = engine;
    }

    @Override
    public void start() {
        engine.run();
        System.out.println("truck start");
    }

    @Override
    public void stop() {
        engine.stop();
        System.out.println("truck stop");
    }
}
