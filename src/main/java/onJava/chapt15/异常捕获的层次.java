package onJava.chapt15;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt15
 * @author: yuanqingtao
 * @date: 2024-11-25 22:24
 **/
public class 异常捕获的层次 {
    void f() throws MyException1 {
        System.out.println("method f() throw an exception");
        throw new MyException1();
    }

    void g() throws MyException1 {
        System.out.println("this is method g(),throws");
        f();
        System.out.println("-+++++++++++---");
    }

    void h(){
        System.out.println("this is method h(),throws");
        try {
            g();
        } catch (MyException1 myException1) {
            myException1.printStackTrace();
        }
        System.out.println("----------------");
    }

    void x(){
        System.out.println("this is method x() throws");
        h();
//        try {
//        } catch (MyException1 myException1) {
//            myException1.printStackTrace();
//        }
    }

    public static void main(String[] args) {
        异常捕获的层次 a = new 异常捕获的层次();
        a.x();
    }
}


class MyException1 extends Exception {

}
