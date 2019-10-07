package priv.phr.demo.spring.ioc.prototype;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {

    @Bean
    @Scope("singleton")
    public Foo foo() {
        return new Foo();
    }

    @Bean
    @Scope("prototype")
    public Bar bar() {
        return new Bar();
    }
}
