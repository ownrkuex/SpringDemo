package priv.phr.demo.spring.aop;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javafx.scene.input.DataFormat;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

@Aspect
public class LogExecTimeAspect {

    @Pointcut("@annotation(priv.phr.demo.spring.aop.LogExecTime) || @within(priv.phr.demo.spring.aop.LogExecTime)")
    public void pointcut() {
    }

    @Around("pointcut()")
    public Object logExecTime(ProceedingJoinPoint joinPoint) throws Throwable {
        Method method = ((MethodSignature) joinPoint.getSignature()).getMethod();
        String methodName = method.getName();
        LogExecTime annotation = method.getAnnotation(LogExecTime.class);
        if (annotation == null) {
            annotation = method.getDeclaringClass().getAnnotation(LogExecTime.class);
        }
        SimpleDateFormat dataFormat = new SimpleDateFormat(annotation.format());

        long start = System.currentTimeMillis();
        System.out.println(methodName + " start at " + dataFormat.format(new Date(start)));
        Object value = joinPoint.proceed();
        long end = System.currentTimeMillis();
        System.out.println(methodName + " end at " + dataFormat.format(new Date(end)));

        System.out.println(methodName + " exec time: " + Duration.ofMillis(end - start));

        return value;
    }
}
