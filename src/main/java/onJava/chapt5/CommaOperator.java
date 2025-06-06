package onJava.chapt5;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt5
 * @author: yuanqingtao
 * @date: 2024-11-12 22:16
 **/
public class CommaOperator {
    public static void main(String[] args) {
        for (int i = 1, j = 1 ,k = 1,m = 2; i < 10 && j < 10; i++, j = i * 2 ,i++ ,j++) {
            System.out.println("i = " + i + "  j =" + j);
        }
        int i = 1, j = i + 1;
         i++ ; j = i*2 ;
    }
}
