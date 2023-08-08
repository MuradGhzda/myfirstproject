package bean;

public class Student {

    private String name;
    private String surname;
    private String group;
    private int age;

    public Student() {
    }

    public Student(String name, String surname, String group, int age) {
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name=" + name + ", surname=" + surname + ", group=" + group + ", age=" + age;
    }

}
