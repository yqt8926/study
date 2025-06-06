package onJava.chapt6.staticorder;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt6.staticorder
 * @author: yuanqingtao
 * @date: 2024-11-19 20:33
 **/
public class Bowl {
    static {
        System.out.println();
    }
    public Bowl(int marker) {
        System.out.println("Bolw(" + marker + ")");

    }
    void f1(int marker){
        System.out.println("f1(" + marker + ")");
    }
}
