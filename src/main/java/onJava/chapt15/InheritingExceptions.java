package onJava.chapt15;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt15
 * @author: yuanqingtao
 * @date: 2024-11-25 20:44
 **/
public class InheritingExceptions {
    void f() throws SimpleException {
        System.out.println("try throw a excption");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingExceptions inheritingExceptions = new InheritingExceptions();
        try {
            inheritingExceptions.f();
        } catch (SimpleException e) {
            System.out.println("catch it!");
        }
    }
}
class SimpleException extends Exception{

}
