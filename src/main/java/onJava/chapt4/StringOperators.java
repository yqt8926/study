package onJava.chapt4;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt4
 * @author: yuanqingtao
 * @date: 2024-11-12 20:44
 **/
public class StringOperators {


    public static void main(String[] args) {
        Object testb = new Object();
        Object tese = new Object();
        Object sss = new Object();
        sss = tese = testb;
        System.out.println(sss);
        System.out.println(tese);
        System.out.println(testb);
        sss = new Object();
        System.out.println(sss);
        System.out.println(tese);
        System.out.println(testb);
        testRe(testb=tese);
        int x,y,z;
        x = y = z = 1;
        System.out.println(x + "  " + y+"   "+z);
        x = 2;
        System.out.println(x + "  " + y+"   "+z);

    }
    private static void testRe(Object object){

    }
}
