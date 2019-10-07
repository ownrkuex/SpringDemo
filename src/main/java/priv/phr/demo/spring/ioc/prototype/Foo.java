package priv.phr.demo.spring.ioc.prototype;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Foo implements ApplicationContextAware {

    private ApplicationContext context;

    @Autowired
    private Bar bar;

    public Bar getNewBar() {
        return context.getBean(Bar.class);
    }

    public Bar getBar() {
        return bar;
    }

    public void setBar(Bar bar) {
        this.bar = bar;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    public ApplicationContext getContext() {
        return context;
    }
}
