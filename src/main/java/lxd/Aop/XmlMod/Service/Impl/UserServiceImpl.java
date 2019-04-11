package lxd.Aop.XmlMod.Service.Impl;

import lxd.Aop.XmlMod.Service.UserService;
import org.springframework.stereotype.Repository;

@Repository
public class UserServiceImpl implements UserService {

    @Override
    public void saveUser(){
        System.out.println("SaveUser");
    }

    @Override
    public void updateUser(int id){
        System.out.println("updateUser");
        throw new RuntimeException("test Exception");
    }

    @Override
    public int deleteUser() {
        System.out.println("deleteUser");
        return 0;
    }
}
