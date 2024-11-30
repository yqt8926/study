package onJava.chapt4;

/**
 * @version V1.0.0
 * @description:验证操作符优先级
 * @packagename: onJava.chapt4
 * @author: yuanqingtao
 * @date: 2024-11-10 15:48
 **/
public class OpsOrder {

    public static void main(String[] args) {
        int x = 1, a = 1, b = 1;
//        x = -a;
//        System.out.println("x = " + x + "  a = " + a + "  b = " + b);
//        x += -a;
//        System.out.println("x = " + x + "  a = " + a + "  b = " + b);
//        x = x + -a;
//        System.out.println("x = " + x + "  a = " + a + "  b = " + b);
//        x = a * -b;//负号的优先级高于*,一元操作符的优先级高于二元操作符
//        System.out.println("x = " + x + "  a = " + a + "  b = " + b);
//        x = -'x';
//        System.out.println("x = " + x );

        x =  1;
//        x++;
        System.out.println("x = " + x++ );
        x =  1;
//        ++x;
        System.out.println("x = " + ++x );
        x =  1;
        x = x++;
        System.out.println("x = " + x );
        x =  1;
        x = ++x;
        System.out.println("x = " + x );
        x =  1;
//        x = - x++;//++没有空格，如果有空格会报错
        x = - x++;
        System.out.println("x = " + x );
        x =  1;
        x = - ++x;
        System.out.println("x = " + x );
        x =  1;
        x = - + +x;
        System.out.println("x = " + x );
        x =  1;
        x = - +-x;
        System.out.println("x = " + x );
        x =  1;
        x =  -  - + + - - +x;
        System.out.println("x = " + x );
        x = a = b = 1;
        x = a++ + b;//++没有空格
        System.out.println("x = " + x + "  a = " + a + "  b = " + b);
        x = 1;
        a = 1;
        b = 1;
        x = a + + + b;//++有空格
        System.out.println("x = " + x + "  a = " + a + "  b = " + b);
        x = 1;
        a = 1;
        b = 1;
        x = a + ++ b;//++有空格
        System.out.println("x = " + x + "  a = " + a + "  b = " + b);
        x=1;a=2;
        x = + - + a ;
        System.out.println("x = " + x + "  a = " + a );
        x=1;
        x =  -  - + + - - +x;
        System.out.println("x = " + x );
        x ++;
    }
}
