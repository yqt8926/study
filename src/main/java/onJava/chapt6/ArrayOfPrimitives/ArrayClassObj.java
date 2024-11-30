package onJava.chapt6.ArrayOfPrimitives;

import java.util.Arrays;
import java.util.Random;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt6.ArrayOfPrimitives
 * @author: yuanqingtao
 * @date: 2024-11-19 21:56
 **/
public class ArrayClassObj {
    public static void main(String[] args) {
        Random random = new Random(47);
        Integer[] a = new Integer[random.nextInt(20)];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(500);
        }
        System.out.println(Arrays.toString(a));
    }
}
