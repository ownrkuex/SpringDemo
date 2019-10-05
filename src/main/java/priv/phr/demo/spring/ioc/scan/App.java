package priv.phr.demo.spring.ioc.scan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("priv.phr.demo.spring.ioc.scan");
        context.registerShutdownHook();
        System.out.println(context.getBean(Foo.class));
        System.out.println(context.getBean(Bar.class));
        System.out.println(context.getBean("foo"));
        System.out.println(context.containsBean("bar")); // false
        System.out.println(context.getBean("myBar"));
    }
}
