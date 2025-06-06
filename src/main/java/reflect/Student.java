package main.java.reflect;

/**
 * @description: 学生类
 * @packagename: reflect
 * @author: yuanqingtao
 * @date: 2020-03-16 18:27
 **/
public class Student implements  Person {
    @Override
    public void say() {
        System.out.println("我是学生，我有说的方法，继承了父接口");
    }

    @Override
    public void eat() {
        System.out.println("我是学生，我有吃的方法，继承了父接口");
    }

    public void study(){
        System.out.println("我是学生，我有自己的学习方法");
    }
}
