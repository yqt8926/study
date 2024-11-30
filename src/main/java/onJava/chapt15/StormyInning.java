package onJava.chapt15;

/**
 * @version V1.0.0
 * @description:1、在实现和继承的时候，可以抛出父类完全一致的异常
 *              2、也可以抛出父类异常列表中子类的异常
 *              3、还可以不抛出异常
 *         但是不能：1、抛出父类方法异常列表不存在的异常
 *                  2、或者父类方法异常列表的父类异常
 * @packagename: onJava.chapt15
 * @author: yuanqingtao
 * @date: 2024-11-26 22:22
 **/
class BaseballException extends Exception {

}

class Foul extends BaseballException {

}

class Strike extends BaseballException {

}
abstract class Inning{
    Inning() throws BaseballException{}

    public void event() throws BaseballException {

    }

    public abstract void atBat()  throws Foul,Strike;
    public void walk(){}

}

class StormException extends Exception {

}

class RainedOut extends StormException {

}

class FoulPop extends Foul {

}

interface Storm {
    void event() throws RainedOut;
    void rainedHard() throws RainedOut;
}
public class StormyInning extends Inning implements Storm{

    public StormyInning() throws RainedOut,BaseballException {
    }
    public StormyInning(String s) throws BaseballException {

    }
//    public void walk() throws FoulPop{
//
//    }

//    public void event() throws RainedOut,BaseballException{
//
//    }
    public void event(){

    }
    @Override
    public void atBat() throws FoulPop, Strike {

    }

    @Override
    public void rainedHard() throws RainedOut {

    }

    public static void main(String[] args) {
        try {
            StormyInning si = new StormyInning();
            si.atBat();
        } catch (FoulPop pop) {
            System.out.println("foulpop");
        } catch (RainedOut out) {
            System.out.println("rained out");
        } catch (BaseballException e) {
            System.out.println("baseball exception");
        }
        try {
            Inning in = new StormyInning();
            in.atBat();
        } catch (FoulPop strike) {
            System.out.println("strike");
        } catch (Foul foul) {
            System.out.println("foul");
        } catch (RainedOut out) {
            System.out.println("rained out");
        } catch (BaseballException ba) {
            System.out.println("baseball");
        }
    }
}
