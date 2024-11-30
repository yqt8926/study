package onJava.chapt15;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt15
 * @author: yuanqingtao
 * @date: 2024-11-25 21:37
 **/
public class ExceptionMethods {
    public static void main(String[] args) {
        try {
            throw new Exception("try throw an exception");
        } catch (Exception e) {
            System.out.println("catch an exception");
            System.out.println("getMessage()"+e.getMessage());
            System.out.println("getLocalizedMessage()"+e.getLocalizedMessage());
            System.out.println("toString()"+e);
            System.out.println("printStackTrace(System.out)");
            e.printStackTrace(System.out);
        }
    }
}
