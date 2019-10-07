package priv.phr.demo.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        context.registerShutdownHook();
        Foo foo = context.getBean(Foo.class);
        Bar bar = context.getBean(Bar.class);
        foo.foo1();
        System.out.println();

        foo.foo2();
        System.out.println();

        System.out.println(foo.sayHello());
        System.out.println();

        bar.bar1();
    }
}
