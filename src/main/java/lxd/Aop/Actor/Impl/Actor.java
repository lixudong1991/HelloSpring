package lxd.Aop.Actor.Impl;

import lxd.Aop.Actor.ActorI;

public class Actor implements ActorI {
    @Override
    public void basicAct(float arg) {
        System.out.println("basicAct: "+arg);
    }

    @Override
    public void dangerAct(float arg) {
        System.out.println("dangerAct: "+arg);
    }
}
