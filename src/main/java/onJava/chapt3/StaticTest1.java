package onJava.chapt3;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt3
 * @author: yuanqingtao
 * @date: 2024-11-10 11:09
 **/
public class StaticTest1 {
    public static void main(String[] args) {
        StaticTest.test++;
        StaticTest s1 = new StaticTest();
        System.out.println(s1.test);
        System.out.println(StaticTest.test);
    }
}
