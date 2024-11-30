package onJava.chapt6;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt6
 * @author: yuanqingtao
 * @date: 2024-11-14 21:04
 **/
public class PassingThis {
    public static void main(String[] args) {
        new Person().eat(new Apple());
    }
}
