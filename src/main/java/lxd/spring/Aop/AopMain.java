package lxd.spring.Aop;

import lxd.spring.Aop.Actor.ActorI;
import lxd.spring.Aop.Actor.Impl.Actor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AopMain {
    public static void main(String[] args) {
        final Actor actor=new Actor();
        actor.basicAct(110f);
        actor.dangerAct(500f);
        ActorI proxyActor= (ActorI) Proxy.newProxyInstance(actor.getClass().getClassLoader(), actor.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Float arg= (Float) args[0];

                if("basicAct".equals(method.getName()))
                {
                    if(arg>200f)
                    {
                        return method.invoke(actor,arg);
                    }
                }

                if("dangerAct".equals(method.getName()))
                {
                    if(arg>500f)
                    {
                        return method.invoke(actor,arg);
                    }
                }
                return null;
            }
        });

        proxyActor.basicAct(210f);
        proxyActor.dangerAct(510f);

    }
}
