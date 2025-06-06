package main.java.order;

/**
 * @author yuanqingtao
 * @version 1.0
 * @date 2021/6/16 10:02 上午
 * @description  非继承关系中的初始化顺序
 *
 *
 * 1。static静态代码块和静态成员
 * 1.1  System.out.println("第1个主类对象：");
 * 2。普通成员
 * 3.构造函数执行
 *
 *根据《Java编程思想》与这里的实验总结：
 * 1、static静态代码块和静态成员最早初始化，它们发生在本类有任何调用开始之前，即通过static（包括main方法在内）访问该类
 * 2、如果通过构造方法访问该类，才会初始化非静态变量和实例代码块
 * 3、访问构造方法
 *  第二步和第三步是紧挨着的！！！！
 */
public class InitialOrderWithoutExtend {
    static SampleClass sam = new SampleClass("静态成员sam初始化");
    SampleClass sam1 = new SampleClass("普通成员sam1初始化");
    static {
        System.out.println("static块执行");
        if (sam == null)
            System.out.println("sam is null");
        sam = new SampleClass("静态块内初始化sam成员变量");
    }

    SampleClass sam2 = new SampleClass("普通成员sam2初始化");

    InitialOrderWithoutExtend() {
        System.out.println("InitialOrderWithoutExtend默认构造函数被调用");
    }

    public static void main(String[] args) {
        // 创建第1个主类对象
        System.out.println("第1个主类对象：");
        InitialOrderWithoutExtend ts = new InitialOrderWithoutExtend();

        // 创建第2个主类对象
        System.out.println("第2个主类对象：");
        InitialOrderWithoutExtend ts2 = new InitialOrderWithoutExtend();

        // 查看两个主类对象的静态成员：
        System.out.println("2个主类对象的静态对象：");
        System.out.println("第1个主类对象, 静态成员sam.s: " + ts.sam);
        System.out.println("第2个主类对象, 静态成员sam.s: " + ts2.sam);
    }

}

class SampleClass {
    // SampleClass 不能包含任何主类InitialOrderWithoutExtend的成员变量
    // 否则导致循环引用，循环初始化，调用栈深度过大
    // 抛出 StackOverFlow 异常
    // static InitialOrderWithoutExtend iniClass1 = new InitialOrderWithoutExtend("静态成员iniClass1初始化");
    // InitialOrderWithoutExtend iniClass2 = new InitialOrderWithoutExtend("普通成员成员iniClass2初始化");

    String s;

    SampleClass(String s) {
        this.s = s;
        System.out.println(s);
    }

    SampleClass() {
        System.out.println("SampleClass默认构造函数被调用");
    }

    @Override
    public String toString() {
        return this.s;
    }
}
