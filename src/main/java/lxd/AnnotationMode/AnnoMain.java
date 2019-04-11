package lxd.AnnotationMode;

import lxd.AnnotationMode.entity.StudentClass;
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

