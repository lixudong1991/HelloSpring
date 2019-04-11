package lxd.XmlMode.entity;

public class Student {
    int id;
    String name;
    int age;
    int sex;
    public void init()
    {
        System.out.println(name+" init");
    }
    public void destroy()
    {
        System.out.println(name+" destroy");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
