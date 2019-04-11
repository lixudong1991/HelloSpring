package lxd.spring.XmlMode.entity;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class StudentClass {
    int id;
    Date time;
    String timeString;
    List<Student> students;
    Map<Integer,Student> studentMap;
    public StudentClass() {
    }

    public StudentClass(int id, Date time, String timeString, List<Student> students, Map<Integer, Student> studentMap) {
        this.id = id;
        this.time = time;
        this.timeString = timeString;
        this.students = students;
        this.studentMap = studentMap;
    }

    public Map<Integer, Student> getStudentMap() {
        return studentMap;
    }

    public void setStudentMap(Map<Integer, Student> studentMap) {
        this.studentMap = studentMap;
    }

    public String getTimeString() {
        return timeString;
    }

    public void setTimeString(String timeString) {
        this.timeString = timeString;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "id=" + id +
                ", time=" + time +
                ", timeString='" + timeString + '\'' +
                ", students=" + students +
                ", studentMap=" + studentMap +
                '}';
    }
}
