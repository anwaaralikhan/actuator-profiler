package com.dc.boot.actuator.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class InstrumentationAspect {

	@Around("@annotation(com.dc.boot.actuator.annotations.EnableInstrumentation)")
	public Object enableInstrumentation(ProceedingJoinPoint joinPoint) throws Throwable {
		long start = System.nanoTime();
	    Object proceed = joinPoint.proceed();
	    long executionTime = System.nanoTime() - start;
	    System.out.println(joinPoint.getSignature() + " executed in " + executionTime + "ms");
	    return proceed;
	}
}
