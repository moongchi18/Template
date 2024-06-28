package com.example.demo.history;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class ExecutionHistoryLogger {

	@Around("@annotation(ExecutionHistory)")
	public Object historyExecute(ProceedingJoinPoint joinPoint) throws Throwable {
		for (Object obj : joinPoint.getArgs()) {
			if(obj instanceof FieldPrinter) {
			}
		}
		
		Object result = null;
		try {
			result = joinPoint.proceed();
		} catch (Exception e) {
			log.error("{} - ERROR", joinPoint.getSignature().getName());
			log.error(e.getMessage());
		} 
		return result;
	}
}
