package lxd.Aop.XmlMod.Utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Arrays;

public class LogAspect {

    public void printLog(JoinPoint point)
    {
        System.out.println("LogAspect printLog... args:"+Arrays.toString(point.getArgs()));
    }

    public void onExceptionLog()
    {
        System.out.println("LogAspect ExceptionLog...");
    }

    public void afterMethod()
    {
        System.out.println("LogAspect afterMethod...");
    }
    public void afterReturnMethod()
    {
        System.out.println("LogAspect afterReturnMethod...");
    }

    public Object aroundPrintLog(ProceedingJoinPoint point)
    {
        Object ret=null;
        try {
            System.out.println("LogAspect aroundPrintLogBefore...");
            ret=point.proceed();
            System.out.println("LogAspect aroundPrintLogAfter...");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return ret;
    }

}
