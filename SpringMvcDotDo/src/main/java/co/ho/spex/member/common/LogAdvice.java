package co.ho.spex.member.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAdvice {
	@Before( "execution(* co.ho.spex..*Impl.*(..))")
	public void logBefore() {
		System.out.println("======================동작");
	}
}
