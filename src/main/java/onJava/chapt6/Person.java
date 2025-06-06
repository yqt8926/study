package onJava.chapt6;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt6
 * @author: yuanqingtao
 * @date: 2024-11-14 21:02
 **/
public class Person {

    public void eat(Apple a){
        Apple apple = a.getPeeled();
        System.out.println("先削皮再吃苹果");
    }
}
