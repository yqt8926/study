package onJava.chapt6.order;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt6.order
 * @author: yuanqingtao
 * @date: 2024-11-14 22:28
 **/
public class House {
    private Window w1 = new Window(1);

    public House() {
        System.out.println("House()");
        w3 = new Window(33);
    }

    Window w2 = new Window(2);
    void f(){
        System.out.println("f()");
    }

    Window w3 = new Window(3);
}
