package nitial.order;

/**
 * @author yuanqingtao
 * @version 1.0
 * @date 2021/6/16 10:17 上午
 * @description   继承关系中的初始化顺序
 *
 *
 *
 * 1.父类静态代码区和父类静态成员
 * 2.子类静态代码区和子类静态成员
 * 3.父类非静态代码区和普通成员
 * 4.父类构造函数
 * 5.子类非静态代码区和普通成员
 * 6.子类构造函数
 *
 */
public class InitialOrderWithExtend {
    public static void main(String[] args) {
        Father ts = new Son();
    }
}

class Father {
    {
        System.out.println("父类 非静态块 1  执行");
    }
    static {
        System.out.println("父类 static块 1  执行");
    }
    static Sample staticSam1 = new Sample("父类 静态成员 staticSam1 初始化");
    Sample sam1 = new Sample("父类 普通成员 sam1 初始化");
    static Sample staticSam2 = new Sample("父类 静态成员 staticSam2 初始化");
    static {
        System.out.println("父类 static块 2  执行");
    }

    Father() {
        System.out.println("父类 默认构造函数被调用");
    }

    Sample sam2 = new Sample("父类 普通成员 sam2 初始化");

    {
        System.out.println("父类 非静态块 2  执行");
    }

}

class Son extends Father {
    {
        System.out.println("子类 非静态块 1  执行");
    }

    static Sample staticSamSub1 = new Sample("子类 静态成员 staticSamSub1 初始化");

    Son() {
        System.out.println("子类 默认构造函数被调用");
    }

    Sample sam1 = new Sample("子类 普通成员 sam1 初始化");
    static Sample staticSamSub2 = new Sample("子类 静态成员 staticSamSub2 初始化");

    static {
        System.out.println("子类 static块1  执行");
    }

    Sample sam2 = new Sample("子类 普通成员 sam2 初始化");

    {
        System.out.println("子类 非静态块 2  执行");
    }

    static {
        System.out.println("子类 static块2  执行");
    }
}

class Sample {
    Sample(String s) {
        System.out.println(s);
    }

    Sample() {
        System.out.println("Sample默认构造函数被调用");
    }
}
