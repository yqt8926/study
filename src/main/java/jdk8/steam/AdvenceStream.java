package main.java.jdk8.steam;

import java.util.stream.Stream;

/**
 * @description: steam进阶功能
 * @packagename: jdk8.steam
 * @author: yuanqingtao
 * @date: 2020-04-25 13:10
 **/
public class AdvenceStream {

    public static void main(String[] args) {
//        map();
        flatMap();
    }

    //mapToLong、mapToDouble 与mapToInt 类似,返回的stream 是IntStream，及结果只能转化成int，若果不用对应的流或者方法，会编译报错：类型无法转换
    private static void map(){
        Stream.of(3.00,4.00,5.11).mapToDouble(e->e+1).forEach(System.out::println);
    }

    private static void flatMap(){
        Stream.of("a-c-v","as-d-vds","qw-gf-fgh-xv-sdf-cx").flatMap(e->Stream.of(e.split("-"))).forEach(System.out::println);
    }
}
