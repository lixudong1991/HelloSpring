package lxd.Aop.AnnoMod.Utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component//1,配置切入的类的bean
@Aspect//2，配置切面和切入类
public class AnnoLogAspect {

    @Pointcut("execution(* lxd.Aop.AnnoMod..*.updateStudent())")//等于aop:pointcut的作用，通过引用方法名(包括括号)来引用该切入点
    private void pointCut1(){}

    @Before("execution(* lxd.Aop.AnnoMod..*.saveStudent(*,*))")
    public void printLog(JoinPoint point)
    {
        System.out.println("AnnoLogAspect printLog... args:"+Arrays.toString(point.getArgs()));
    }

    @AfterThrowing("pointCut1()")
    public void onExceptionLog()
    {
        System.out.println("AnnoLogAspect ExceptionLog...");
    }
    @After("pointCut1()")
    public void afterMethod()
    {
        System.out.println("AnnoLogAspect afterMethod...");
    }
    @AfterReturning("pointCut1()")
    public void afterReturnMethod()
    {
        System.out.println("AnnoLogAspect afterReturnMethod...");
    }

    @Around("execution(* lxd.Aop.AnnoMod..*.deleteStudent(..))")
    public Object aroundPrintLog(ProceedingJoinPoint point)
    {
        Object ret=null;
        try {
            System.out.println("AnnoLogAspect aroundPrintLogBefore...");
            ret=point.proceed(point.getArgs());
            System.out.println("AnnoLogAspect aroundPrintLogAfter...");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return ret;
    }

}
