package lxd.spring.AnnotationMode;

import lxd.spring.AnnotationMode.entity.Student;
import lxd.spring.AnnotationMode.entity.StudentClass;
import lxd.spring.AnnotationMode.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AnnoMain {
    public static void main(String[] args) {
        new AnnoMain().testComponentAnno();
    }
    void testComponentAnno()
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("AnnoHello.xml");
        StudentClass studentClass= (StudentClass) context.getBean("studentClass");
        System.out.println(studentClass);
    }

}

