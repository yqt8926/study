package main.java.jdk8.steam;

import java.util.Arrays;
import java.util.List;

/**
 * @description: 流的中间操作
 * @packagename: jdk8.steam
 * @author: yuanqingtao
 * @date: 2020-04-22 15:46
 **/
public class InterOperaStream {

    public static void main(String[] args) {
//        filter();
//        map();
//        subElem();
//        sorted();
        distinct();
    }

    //1、filter 方法用于通过设置的条件过滤出元素
    private static void filter (){
        List<String> strings = Arrays.asList("Hollis", "", "", "Hello", "", "Hollis");
        strings.stream().filter(s -> !s.isEmpty()).forEach(System.out::println);
    }

    //2、map 方法用于映射每个元素到对应的结果
    private static void map (){
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        numbers.stream().map(integer -> integer*10).forEach(System.out::println);
    }

    //3、limit 返回 Stream 的前面 n 个元素；skip 则是扔掉前 n 个元素
    private static void subElem (){
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        numbers.stream().limit(4).forEach(System.out::println);
        System.out.println("==========");
        numbers.stream().skip(2).forEach(System.out::println);
    }

    //4、sorted 方法用于对流进行排序:从小到大排序
    private static void sorted (){
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        numbers.stream().sorted().forEach(System.out::println);
    }

    //4、distinct主要用来去重
    private static void distinct (){
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        numbers.stream().distinct().forEach(System.out::println);
    }


}
