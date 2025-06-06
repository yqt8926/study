package onJava.chapt15;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt15
 * @author: yuanqingtao
 * @date: 2024-11-26 21:57
 **/
public class LostMessage {
    void f() throws VeryImpotantException {
        throw new VeryImpotantException();
    }
    void dispost() throws HoHunException {
        throw new HoHunException();
    }

    public static void main(String[] args) {
        LostMessage lm = new LostMessage();
        try {
            try {
                lm.f();
            } catch (VeryImpotantException e) {
                System.out.println("这里");
                throw e;
            }
            finally {
                System.out.println("这里会不会执行");
                lm.dispost();
            }
        } catch (VeryImpotantException | HoHunException e) {
            System.out.println(e);
        }
    }
}

class VeryImpotantException extends Exception {
    @Override
    public String toString() {
        return "THIS IS A IMPORTANT EXCEPTION";
    }
}

class HoHunException extends Exception {
    @Override
    public String toString() {
        return "THIS IS A TRIVE EXCEPTION";
    }
}
