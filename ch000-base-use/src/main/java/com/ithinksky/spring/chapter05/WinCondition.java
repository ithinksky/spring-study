package com.ithinksky.spring.chapter05;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 定义条件注册
 *
 * @author tengpeng.gao
 * @since 2018/8/8
 */
public class WinCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        Environment environment = context.getEnvironment();
        String osName = environment.getProperty("os.name");
        System.out.println("osName == " + osName);
        if (osName.contains("Windows")) {
            return true;
        }

        return false;
    }
}
