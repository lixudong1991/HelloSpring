package lxd.spring.AnnotationMode.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

@Component
public class StudentClass {
    @Value("1")
    int id;
    @Resource(name = "date")
    Date time;
    @Value("AnnoStudentClass")
    String name;
    @Autowired
    Student student;

    @Override
    public String toString() {
        return "StudentClass{" +
                "id=" + id +
                ", time=" + time +
                ", name='" + name + '\'' +
                ", student=" + student +
                '}';
    }
}
