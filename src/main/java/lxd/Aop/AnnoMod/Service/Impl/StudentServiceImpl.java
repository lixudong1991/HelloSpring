package lxd.Aop.AnnoMod.Service.Impl;

import lxd.Aop.AnnoMod.Service.StudentService;
import org.springframework.stereotype.Repository;

@Repository
public class StudentServiceImpl implements StudentService {

    @Override
    public void saveStudent(int id, String s) {
        System.out.println("saveStudent");
    }

    @Override
    public void updateStudent() {
        System.out.println("updateStudent");
        int i=1/0;
    }

    @Override
    public int deleteStudent(int i) {
        System.out.println("deleteStudent");
        return 0;
    }
}
