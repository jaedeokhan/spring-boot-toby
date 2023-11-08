package tobyspring.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import tobyspring.config.ConditionalWebServer;

import java.util.Map;

public class ConditionWebServer implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> annotationAttributes = metadata.getAnnotationAttributes(ConditionalWebServer.class.getName());
        Boolean value = (Boolean)annotationAttributes.get("value");
        return value;
    }
}
