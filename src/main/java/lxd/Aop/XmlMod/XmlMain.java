package lxd.Aop.XmlMod;

import lxd.Aop.XmlMod.Service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Component
public class XmlMain {

    @Resource(name="userServiceImpl")
    UserService userService;

    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("Aop.xml");
        XmlMain xmlMain= (XmlMain) ac.getBean("xmlMain");
        xmlMain.testXmlAop();
    }
    public void testXmlAop()  {
        userService.saveUser(1,"sssss");
        userService.updateUser(1);
        userService.deleteUser();
    }
}
