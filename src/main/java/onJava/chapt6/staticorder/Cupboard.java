package onJava.chapt6.staticorder;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt6.staticorder
 * @author: yuanqingtao
 * @date: 2024-11-19 20:37
 **/
public class Cupboard {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);

    public Cupboard() {
        System.out.println("Cupborad()");
        bowl4.f1(4);
    }
    void f3(int marker){
        System.out.println("f3("+marker+")");
    }

    static Bowl bowl5 = new Bowl(5);
}
