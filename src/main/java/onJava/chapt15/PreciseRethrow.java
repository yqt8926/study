package onJava.chapt15;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt15
 * @author: yuanqingtao
 * @date: 2024-11-25 22:51
 **/
public class PreciseRethrow {
    void f() throws DerivedException {
        System.out.println("throw exception");
        throw new DerivedException();
    }

    void h() throws DerivedException {
        System.out.println("asd");
        try {
            f();
        } catch (BaseException e) {
            throw new DerivedException();
        }
    }
}

class BaseException extends Exception {

}

class DerivedException extends BaseException {

}
