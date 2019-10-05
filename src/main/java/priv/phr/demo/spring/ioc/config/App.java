package priv.phr.demo.spring.ioc.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        context.registerShutdownHook(); // shutdown correctly when JVM exit
        context.registerBean(Truck.class); // manually register bean

        ICar car = (ICar) context.getBean("car");
        car.start();
        car.stop();
        System.out.println("--------------------------");
        ICar motorBike = context.getBean(MotorBike.class);
        motorBike.start();
        motorBike.stop();
        System.out.println("--------------------------");
        ICar truck = context.getBean("truck", Truck.class);
        truck.start();
        truck.stop();
        System.out.println("--------------------------");
    }
}
