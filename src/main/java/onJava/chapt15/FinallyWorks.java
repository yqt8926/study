package onJava.chapt15;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt15
 * @author: yuanqingtao
 * @date: 2024-11-26 21:31
 **/
public class FinallyWorks {
    private static int count = 0;

    public static void main(String[] args) {
        while (true) {
            try {
                if (count++ == 0) {
                    throw new TreeException();
                }
                System.out.println("hava no exception");
            } catch (TreeException e) {
                System.out.println("catch exception");
            } finally {
                System.out.println("in finally");
                if (count == 2) break;
            }
        }
    }
}

class TreeException extends Exception {

}
