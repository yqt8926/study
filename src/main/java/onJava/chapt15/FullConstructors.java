package onJava.chapt15;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt15
 * @author: yuanqingtao
 * @date: 2024-11-25 20:51
 **/
public class FullConstructors {
    void f() throws MyException {
        System.out.println("throw an non-args exception");
        throw new MyException();
    }

    void g() throws MyException {
        System.out.println("throw an string-arg exception");
        throw new MyException("this is an string arg exveption");
    }

    public static void main(String[] args) {
        FullConstructors fullConstructors = new FullConstructors();
        try {
            fullConstructors.f();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }
        try {
            fullConstructors.g();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }
    }
}

class MyException extends Exception {
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}
