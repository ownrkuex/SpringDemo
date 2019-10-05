package priv.phr.demo.spring.ioc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MotorBike implements ICar {

    private IEngine engine;

    // autowire by name
    // setter autowire
    @Autowired
    public void setEngine(@Qualifier("myMotorBikeEngine111") IEngine engine) {
        this.engine = engine;
    }

    @Override
    public void start() {
        engine.run();
        System.out.println("motor bike start");
    }

    @Override
    public void stop() {
        engine.stop();
        System.out.println("motor bike stop");
    }
}
