package priv.phr.demo.spring.ioc.prototype;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        context.registerShutdownHook();
        System.out.println(context);
        System.out.println(context.getBean(Foo.class).getContext());
        System.out.println("-----------------------------");
        System.out.println(context.getBean(Bar.class));
        System.out.println(context.getBean(Bar.class));
        System.out.println("-----------------------------");
        System.out.println(context.getBean(Foo.class).getBar());
        System.out.println(context.getBean(Foo.class).getBar());
        System.out.println("-----------------------------");
        System.out.println(context.getBean(Foo.class).getNewBar());
        System.out.println(context.getBean(Foo.class).getNewBar());
    }
}
