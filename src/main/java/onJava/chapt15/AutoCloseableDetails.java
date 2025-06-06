package onJava.chapt15;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt15
 * @author: yuanqingtao
 * @date: 2024-11-28 21:27
 **/
class Reporter implements AutoCloseable {
    String name = getClass().getName();

    public Reporter() {
        System.out.println("creating " + name);
    }

    @Override
    public void close() throws InstantiationException  {
        System.out.println("closing" + name);
    }
}
class First extends Reporter{

}

class Second extends Reporter {

}

public class AutoCloseableDetails {
    public static void main(String[] args) {
        try (
                First first = new First();
                Second second = new Second()
        ) {

        } catch (Exception e) {
            System.out.println("抛异常了");
        }
    }
}
