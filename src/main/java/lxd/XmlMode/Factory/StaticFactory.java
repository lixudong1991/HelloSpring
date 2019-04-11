package lxd.XmlMode.Factory;

import lxd.XmlMode.entity.User;

public class StaticFactory {
    public static User createUser(){
        User user=new User();
        user.setName("StaticFactoryCreateUser");
        return user;
    }

}
