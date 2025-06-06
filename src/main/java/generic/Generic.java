package main.java.generic;

/**
 * @description: 泛型学习
 * @packagename: generic
 * @author: yuanqingtao
 * @date: 2020-03-05 16:25
 **/

//此处T可以随便写为任意英文字符以及引用数据类型，（包括大小写，Java要求的关键字除外，数字、标点符号等都不可以），常见的如T、E、K、V等形式的参数常用于表示泛型
public class Generic<T,b,j> {
    //泛型不能修饰静态变量
//    private static T teststatic;
    private T key;
    private String value;

    public Generic(T t){
        this.key=t;
    }

    public T get(){
        return key;
    }
    //泛型不能用在static方法中
//    public static T testStaticMethod(){
//        return "key";
//    }
}
