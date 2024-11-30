package onJava.chapt15;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt15
 * @author: yuanqingtao
 * @date: 2024-11-26 21:19
 **/
public class NeverCaugth {
    void f(){
        System.out.println("throw runtime exception from f()");
        throw new RuntimeException();
    }

    void g(){
        System.out.println("method g()");
        f();
    }

    void h(){
        System.out.println("method h()");
        g();
    }

    public static void main(String[] args) {
        NeverCaugth caugth = new NeverCaugth();
        caugth.h();
    }
}
