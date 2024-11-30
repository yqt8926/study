package onJava.chapt15;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt15
 * @author: yuanqingtao
 * @date: 2024-11-25 22:13
 **/
public class Rethrowing {
    void f() throws Exception {
        System.out.println("throw exception from f()");
        throw new Exception();
    }

    void g() throws Exception {
        try {
            f();
        } catch (Exception e) {
            System.out.println("rethrow exception from g()");
            e.printStackTrace(System.out);
            throw e;
        }
    }

    void h() throws Exception {
        try {
            f();
        } catch (Exception e) {
            System.out.println("rethrow an exception fron h()");
            e.printStackTrace(System.out);
            throw (Exception) e.fillInStackTrace();
        }
    }

    public static void main(String[] args) {
        Rethrowing rethrowing = new Rethrowing();
        try {
            rethrowing.g();
        } catch (Exception e) {
            System.out.println("main method throw exception");
            e.printStackTrace(System.out);
        }

        try {
            rethrowing.h();
        } catch (Exception e) {
            System.out.println("main method throw exception");
            e.printStackTrace(System.out);
        }
    }
}
