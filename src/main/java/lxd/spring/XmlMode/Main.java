package lxd.spring.XmlMode;


import lxd.spring.AnnotationMode.entity.Student;
import lxd.spring.AnnotationMode.entity.StudentClass;
import lxd.spring.AnnotationMode.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
      new Main().testStudentClass();
    }
    void testUser()
    {
        ApplicationContext ac=new ClassPathXmlApplicationContext("Hello.xml");
        User user1= (User) ac.getBean("user1");
        System.out.println( user1);
        User staticuser= (User) ac.getBean("staticuser");
        System.out.println( staticuser);
        User instanceUser= (User) ac.getBean("instanceUser");
        System.out.println(instanceUser);
    }
    void testStudent()
    {
        ApplicationContext ac=new ClassPathXmlApplicationContext("Hello.xml");
        Student student1= (Student) ac.getBean("singletonStudent");
        System.out.println( student1);
        Student student2= (Student) ac.getBean("singletonStudent");
        System.out.println( student2);

        Student student3 = (Student) ac.getBean("prototypeStudent");
        Student student4 = (Student) ac.getBean("prototypeStudent");
        System.out.println(student3);
        System.out.println(student4);

        ((ClassPathXmlApplicationContext) ac).close();
    }
    void testStudentClass()
    {
        ApplicationContext ac=new ClassPathXmlApplicationContext("Hello1.xml");
        StudentClass studentClass = (StudentClass) ac.getBean("studentClass");
        StudentClass studentClass1 = (StudentClass) ac.getBean("studentClass1");
        System.out.println(studentClass);
        System.out.println(studentClass1);
    }
}
