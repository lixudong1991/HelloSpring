package lxd.spring.XmlMode.Factory;

import lxd.spring.XmlMode.entity.User;

public class StaticFactory {
    public static User createUser(){
        User user=new User();
        user.setName("StaticFactoryCreateUser");
        return user;
    }

}
