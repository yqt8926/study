package onJava.chapt5;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt5
 * @author: yuanqingtao
 * @date: 2024-11-12 22:32
 **/
public class BreakAndContinue {

    public static void main(String[] args) {
        int[] intArray = {1,2,3,45,6,6,7,8,8,9,0,11,12,123};
        for (int each:intArray) {
            if (each>10){
                continue;
            }
            System.out.println(each);
            if (each == 9) {
                break;
            }
        }
//        Arrays.stream(intArray).forEach(each->{
//            if (each>10){
//                continue;
//            }
//            System.out.println(each);
//            if (each == 9) {
//                break;
//            }
//        });


    }

}
