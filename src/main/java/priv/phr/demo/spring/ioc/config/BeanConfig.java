package priv.phr.demo.spring.ioc.config;

import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.*;
import org.springframework.context.event.ContextClosedEvent;

@Configuration
@Import({WheelConfig.class})
public class BeanConfig {

    @Bean // bean name is equal to method name
    @Primary
    public IEngine defaultEngine() {
        return new DefaultEngine();
    }

    @Bean("myMotorBikeEngine111")
    public IEngine motorBikeEngine() {
        return new MotorBikeEngine();
    }

    @Bean
    public IEngine truckEngine() {
        return new TruckEngine();
    }

    @Bean
    @Lazy
    public ICar car() {
        return new Car();
    }

    @Bean
    public ICar motorBike() {
        return new MotorBike();
    }

    @Bean
    public ApplicationListener<ContextClosedEvent> contextClosedListener() {
        return new MyContextClosedListener();
    }

    @Bean
    public InstantiationAwareBeanPostProcessor beanPostProcessor() {
        return new MyBeanProcessor();
    }
}
