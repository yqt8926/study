package onJava.chapt6.ArrayOfPrimitives;

import java.util.Arrays;
import java.util.Random;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt6.ArrayOfPrimitives
 * @author: yuanqingtao
 * @date: 2024-11-19 21:52
 **/
public class ArrayNew {
    public static void main(String[] args) {
        int[] a;
        Random random = new Random(47);
        a = new int[random.nextInt(20)];
        System.out.println("a.length="+a.length);
        System.out.println(Arrays.toString(a));
    }
}
