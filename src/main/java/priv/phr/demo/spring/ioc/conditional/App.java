package priv.phr.demo.spring.ioc.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        context.registerShutdownHook();
        System.out.println(context.getBean(Genius.class));
    }
}
