package onJava.chapt6.enumtest;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt6.enumtest
 * @author: yuanqingtao
 * @date: 2024-11-20 21:59
 **/
public class EnumOrder {
    public static void main(String[] args) {
        for (Spiciness ss: Spiciness.values()) {
            System.out.println(ss + "  ,ordinal " + ss.ordinal());
        }
    }
}
