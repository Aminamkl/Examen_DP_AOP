package org.example.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class LockingAspect {
    @Around("@annotation(org.example.aspects.Lock)")
    public Object log(ProceedingJoinPoint joinPoint) {
        System.out.println("verrouillée Methode ");
        return null;
    }
}
