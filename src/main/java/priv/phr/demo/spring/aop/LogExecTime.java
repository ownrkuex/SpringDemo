package priv.phr.demo.spring.aop;

import java.lang.annotation.*;
import java.time.temporal.ChronoUnit;

import org.springframework.core.annotation.AliasFor;

@Target({ElementType.METHOD, ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface LogExecTime {

    @AliasFor("format")
    String value() default "yyyy-MM-dd hh:mm:ss SSS";

    @AliasFor("value")
    String format() default "yyyy-MM-dd hh:mm:ss SSS";
}
