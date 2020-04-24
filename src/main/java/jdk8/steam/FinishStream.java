package jdk8.steam;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @description: 流的终止操作
 * @packagename: jdk8.steam
 * @author: yuanqingtao
 * @date: 2020-04-22 16:45
 **/
public class FinishStream {
    public static void main(String[] args) {
        cout();
    }

    private static void forEach (){
        Random random = new Random();
        random.ints().limit(10).forEach(s->{
            String string = "s"+new Integer(s).toString();
            System.out.println(string);
        });
    }

    // map 与 forEach可以实现相同的功能，即遍历对象，只是forEach可以进一步输出结果，map会返回stream
    private static void map (){
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        numbers.stream().map(integer -> {
            String string = "s"+new Integer(integer).toString();
            return string;
        }).forEach(System.out::println);
    }

    private static void cout(){
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        System.out.println(numbers.stream().count());
//        Random random = new Random();
//        System.out.println(random.ints().count());
    }
}
