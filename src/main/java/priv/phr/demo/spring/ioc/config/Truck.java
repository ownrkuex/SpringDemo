package priv.phr.demo.spring.ioc.config;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

public class Truck implements ICar, InitializingBean, DisposableBean {

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

    @Override
    public void afterPropertiesSet() {
        System.out.println("InitializingBean::afterPropertiesSet");
    }

    @PostConstruct
    public void init() {
        System.out.println("@PostConstruct");
    }

    @Override
    public void destroy() {
        System.out.println("DisposableBean::destroy");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("@PreDestroy");
    }
}
