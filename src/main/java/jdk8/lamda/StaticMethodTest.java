package main.java.jdk8.lamda;

/**
 * @description: lamda静态方法调用示例
 * @packagename: jdk8.lamda
 * @author: yuanqingtao
 * @date: 2020-04-27 18:06
 **/
public class StaticMethodTest {

    public static void main(String[] args) {
        IMessage2<String,Double> iMessage2 = String::valueOf;
        System.out.println(iMessage2.zhuanhuan(200.002).replaceAll("0","9"));
    }
}
