package lxd.XmlMode.Factory;

import lxd.XmlMode.entity.User;

public class InstanceFactory {
    public User createUser(){
        User user=new User();
        user.setName("InstanceFactoryCreateUser");
        return user;
    }
}
