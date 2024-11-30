package onJava.chapt6.staticorder;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt6.staticorder
 * @author: yuanqingtao
 * @date: 2024-11-19 20:34
 **/
public class Table {
    static Bowl bowl = new Bowl(1);

    public Table() {
        System.out.println("Table()");
        bowl2.f1(1);
    }

    void f2(int marker) {
        System.out.println("f2(" + marker + ")");
    }

    static Bowl bowl2 = new Bowl(2);
}
