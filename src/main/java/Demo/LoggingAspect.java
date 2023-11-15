package Demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* Demo.ShoppingCart.checkout(..))")
    public void before_logger(JoinPoint jp){
       // System.out.println(jp.getSignature());
        String args = jp.getArgs()[0].toString();
        System.out.println("Before_Loggers with Arguments :" + args);

    }
    @After("execution(* *.*.checkout(..))")
    public void after_logger(){
        System.out.println("after_logger called");
    }
    @Pointcut("execution(* Demo.ShoppingCart.quantity(..))")
    public void afterReturningPointCut(){
    }
    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")
    public void after_Returning(String retVal){
        System.out.println("After_returning:" + retVal);
    }
}
