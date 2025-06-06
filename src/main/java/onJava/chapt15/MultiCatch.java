package onJava.chapt15;


/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt15
 * @author: yuanqingtao
 * @date: 2024-11-25 21:44
 **/
public class MultiCatch {
    void f() throws Excep1,Excep2,Excep3{}
    void process(){}

    void oldCatch(){
        try {
            f();
        } catch (Excep1 excep1) {
            process();
        } catch (Excep2 excep2) {
            process();
        } catch (Excep3 excep3) {
            process();
        }
    }

    void multiCatch(){
        try {
            f();
        } catch (Excep1 | Excep2 | Excep3 e ){
            process();
        }
    }

}

class EBase1 extends Exception {

}

class Excep1 extends EBase1 {

}

class EBase2 extends Exception {

}

class Excep2 extends EBase2 {

}

class EBase3 extends Exception {

}

class Excep3 extends EBase3 {

}
