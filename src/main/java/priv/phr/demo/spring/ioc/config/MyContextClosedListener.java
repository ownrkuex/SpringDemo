package priv.phr.demo.spring.ioc.config;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class MyContextClosedListener implements ApplicationListener<ContextClosedEvent> {
    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("my context closed!");
    }
}
