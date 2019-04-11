package lxd.spring.XmlMode.Factory;

import lxd.spring.XmlMode.entity.User;

public class InstanceFactory {
    public User createUser(){
        User user=new User();
        user.setName("InstanceFactoryCreateUser");
        return user;
    }
}
