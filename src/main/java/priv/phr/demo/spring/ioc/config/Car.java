package priv.phr.demo.spring.ioc.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Car implements ICar {

    // default autowire by type
    // reflection autowire
    // use primary bean
    @Autowired
    private IEngine engine;

    @Autowired // collect beans into list
    private List<IWheel> wheels;

    @Override
    public void start() {
        engine.run();
        System.out.println("car start");
        wheels.forEach(IWheel::rolling);
    }

    @Override
    public void stop() {
        engine.stop();
        System.out.println("car stop");
        wheels.forEach(IWheel::stop);
    }
}
