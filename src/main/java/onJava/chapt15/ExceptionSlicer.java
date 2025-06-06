package onJava.chapt15;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt15
 * @author: yuanqingtao
 * @date: 2024-11-26 22:09
 **/
public class ExceptionSlicer {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } finally {
//            return;
        }
    }
}
