package priv.phr.demo.spring.ioc.config;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;
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
}
