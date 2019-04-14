package lxd.Aop.AnnoMod;

import lxd.Aop.AnnoMod.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class AnnoMain {
    @Autowired
    StudentService studentService;
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("Aop.xml");
        AnnoMain annoMain= (AnnoMain) ac.getBean("annoMain");
        annoMain.testAnnoAop();
    }
    public void testAnnoAop()
    {
        studentService.saveStudent(1,"aaaa");
        studentService.updateStudent();
        studentService.deleteStudent(1);
    }
}
