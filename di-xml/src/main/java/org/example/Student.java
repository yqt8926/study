package org.example;

import lombok.Setter;

//@Setter
public class Student {
    public String name;
    public int age;

    private School school;

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

//    public void setSchool(School school) {
//        System.out.println("调用setter方法自己测");
//        this.school = school;
//    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Student() {
    }

    public Student(String name, int age, School school) {
        System.out.println("Student有参构造方法");
        this.name = name;
        this.age = age;
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
