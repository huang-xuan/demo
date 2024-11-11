package com.example.shardingsphere.service.Aop;

import groovy.util.logging.Slf4j;
import org.apache.shardingsphere.infra.hint.HintManager;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Objects;

/**
 * @author Hemant
 * @date 2024/11/05
 **/
@Slf4j
@Component
@Aspect
public class ShardMasterAop {
    @Around("execution(* com.example.shardingsphere.service.*.*(..))")
    public Object master(ProceedingJoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        Object ret = null;
//        log.info(joinPoint.toShortString());
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        Master master = method.getAnnotation(Master.class);
        HintManager hintManager = null;
        try {
            if (Objects.nonNull(master)) {
                HintManager.clear();
                hintManager = HintManager.getInstance();
                hintManager.setWriteRouteOnly();
            }
            ret = joinPoint.proceed(args);
        } catch (Exception ex) {
//            log.error("exception error",ex);
        } catch (Throwable ex2) {
//            log.error("Throwable",ex2);
        } finally {
            if (Objects.nonNull(master) && Objects.nonNull(hintManager)) {
                hintManager.close();
            }
        }
        return ret;
    }
}
