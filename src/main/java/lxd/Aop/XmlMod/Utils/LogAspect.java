package lxd.Aop.XmlMod.Utils;

public class LogAspect {

    public void printLog()
    {
        System.out.println("LogAspect printLog...");
    }

    public void onExceptionLog()
    {
        System.out.println("LogAspect ExceptionLog...");
    }

    public void afterMethod()
    {
        System.out.println("LogAspect afterMethod...");
    }
}
