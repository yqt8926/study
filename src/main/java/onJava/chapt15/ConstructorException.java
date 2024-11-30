package onJava.chapt15;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt15
 * @author: yuanqingtao
 * @date: 2024-11-28 21:37
 **/
class CE extends Exception {
}

class SecondExcept extends Reporter {
    public SecondExcept() throws CE {
        super();
        throw new CE();
    }
}

public class ConstructorException {
    public static void main(String[] args) {
        try (
                First first = new First();
                SecondExcept secondException = new SecondExcept();
                Second s = new Second();

        ) {
            System.out.println("in body");
        } catch (CE | InstantiationException ce) {
            ce.printStackTrace();
        }
    }
}
