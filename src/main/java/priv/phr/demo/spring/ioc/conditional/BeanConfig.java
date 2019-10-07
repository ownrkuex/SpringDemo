package priv.phr.demo.spring.ioc.conditional;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    @Conditional(LinuxCondition.class)
    public Genius linus() {
        return new Genius("linus");
    }

    @Bean
    @ConditionalOnMissingBean(name = "linus")
    public Genius billGates() {
        return new Genius("Bill Gates");
    }
}
