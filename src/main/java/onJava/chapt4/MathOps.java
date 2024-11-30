package onJava.chapt4;

import java.util.Random;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt4
 * @author: yuanqingtao
 * @date: 2024-11-10 15:08
 **/
public class MathOps {
    public static void main(String[] args) {
        int i, j, k;
        Random rand = new Random(47);
        j = rand.nextInt(100) + 1;
        k = rand.nextInt(100) + 1;
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        i = j + k;
        System.out.println("j + k = " + i);
        i = j - k;
        System.out.println("j - k = " + i);
        i = j / k;
        System.out.println("j / k = " + i);
        i = j * k;
        System.out.println("j * k = " + i);
        i = j % k;
        System.out.println("j % k = " + i);
        j %= k;
        System.out.println("j%=k = " + j);
        float u, v, w;
        v = rand.nextFloat();
        w = rand.nextFloat();
        System.out.println("v = " + v);
        System.out.println("w = " + w);
        u = v + w;
        System.out.println("v + w = " + u);
        u = v - w;
        System.out.println("v - w= " + u);
        u = v / w;
        System.out.println("v / w = " + u);
        u = v * w;
        System.out.println("v * w = " + u);
        v += w;
        System.out.println("v += w = " + v);
        v -= w;
        System.out.println("v -= w = " + v);
        v *= w;
        System.out.println("v *= w =" + v);
        v /= w;
        System.out.println("v /= w =" + v);
        v %= w;
        System.out.println("v %= w =" + v);
//        boolean c = v == v;
        int x = 0, a = 0, b = 0;
        x = -a;
        x += -a;
        x = x + -a;
        x = a * -b;
        x = -'x';

        x = -x++;//++没有空格，如果有空格会报错
        x = 1;a =1;b =1;
        x =  a ++ + b;//++没有空格
        x =  a + + + b;//++有空格
        x = ++ a + b;
    }
}
