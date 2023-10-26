package tobyspring.helloboot;

import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // 애너테이션이 어디까지 살아있을 것인가? 어디까지 유지할 것인가?
@Target(ElementType.TYPE) // 애노테이션이 적용한 위치, 대상에 적용
@Component
public @interface MyComponent {
}
