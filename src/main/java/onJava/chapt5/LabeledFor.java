package onJava.chapt5;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt5
 * @author: yuanqingtao
 * @date: 2024-11-13 21:11
 **/
public class LabeledFor {
    public static void main(String[] args) {
        int i = 0;
        outer:
//        System.out.println("iii");
        for (; true; ) {
            inner:
//            System.out.println("qw");
            for (; i < 10;i++ ) {
                System.out.println("i = " + i);
                if (i == 2) {
                    System.out.println("continue");
                    continue ;
                }
                if (i == 3) {
                    System.out.println("break!");
                    i++;
                    break ;
                }
                if (i == 7) {
                    System.out.println("continue outer");
                    i++;
                    continue outer;
                }
                inner1:
                for (int k = 0; k < 5; k++) {
                    System.out.println("continue inner");
                    continue inner;
                }
            }
        }
//        int a = 1;

    }
}
