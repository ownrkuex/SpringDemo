package priv.phr.demo.spring.ioc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WheelConfig {

    @Bean
    public IWheel wheelA() {
        return new DefaultWheel();
    }

    @Bean
    public IWheel wheelB() {
        return new DefaultWheel();
    }

    @Bean
    public IWheel wheelC() {
        return new DefaultWheel();
    }

    @Bean
    public IWheel wheelD() {
        return new DefaultWheel();
    }
}
