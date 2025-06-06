package main.java.reflect;

/**
 * @description: 反射Class类方法学习
 * @packagename: reflect
 * @author: yuanqingtao
 * @date: 2020-03-16 17:54
 **/
public class ClassStudy {


    public static void main(String[] args) {
        Object obj = new Object();
        Class clazz= obj.getClass();


        Person person = new Student();
        Class clazz1 = person.getClass();
        System.out.println(clazz1);

        GoodStudy goodStudy = new GoodStudy();
        Class clazzzz = goodStudy.getClass();
        //asSubclass(Class<U> clazz)   这个方法类似于类型向下强转，将Class clazzzz 强转成Student.class的子类
        Class clazzGoodStudy  = clazzzz.asSubclass(Student.class);
//        clazz1.getClassLoader();
        System.out.println(clazzGoodStudy);
//        GoodStudy goodStudy = new GoodStudy();

    }

}
