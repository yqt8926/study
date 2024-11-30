package onJava.chapt6.staticorder;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt6.staticorder
 * @author: yuanqingtao
 * @date: 2024-11-19 20:39
 **/
public class StaticInit {
    public static void main(String[] args) {
        System.out.println("main creating new Cupboard()1");
        new Cupboard();
        System.out.println("main creating new Cupboard()1");
        new Cupboard();
        table.f2(2);
        cupboard.f3(3);
    }

    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
}
