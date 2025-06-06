package onJava.chapt6.ArrayOfPrimitives;

import java.util.Arrays;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt6.ArrayOfPrimitives
 * @author: yuanqingtao
 * @date: 2024-11-19 21:50
 **/
public class ArraysOfPrimitives {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6,};
        int[] a2;
        a2 = a;
        for (int i = 0; i <= a2.length - 1; i++) {
            a2[i] += 1;
        }
        System.out.println(Arrays.toString(a));
    }
}
