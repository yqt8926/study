package onJava.chapt15;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt15
 * @author: yuanqingtao
 * @date: 2024-11-25 21:57
 **/
public class WhoCalled {
    void f() {
        try {
            throw new Exception();
        } catch (Exception e) {
            for (StackTraceElement element : e.getStackTrace()) {
                System.out.println(element.getClassName());
                System.out.println("----------------");
                System.out.println(element.toString());
            }
        }
    }

    void g() {
        f();
    }

    void h() {
        f();
    }

    public static void main(String[] args) {
        WhoCalled whoCalled = new WhoCalled();
        System.out.println("!!!!!!!!!!!!!!!!!!!!");
        whoCalled.g();
        System.out.println("!!!!!!!!!!!!!!!!!!!!");
        whoCalled.h();
    }
}
