package jdk8.steam;

import java.util.*;
import java.util.stream.Stream;

/**
 * @description: 流的创建
 * @packagename: jdk8.steam.build
 * @author: yuanqingtao
 * @date: 2020-04-22 15:09
 **/
public class BuildStream {
    public static void main(String[] args) {
        //1、将一个集合类转换成流。  stream()是Collection的方法
        List<String> strings = Arrays.asList("Hollis", "HollisChuang", "hollis", "Hello", "HelloWorld", "Hollis");
        Stream<String> stringStream = strings.stream();

        Map strMap  = new HashMap();

        Collection<String> conn = Arrays.asList("Hollis", "HollisChuang", "hollis", "Hello", "HelloWorld", "Hollis");
        conn.stream();
        //2、使用Stream类提供的方法，直接返回一个由指定元素组成的流。通过of方法.
        Stream<String> stream = Stream.of("Hollis", "HollisChuang", "hollis", "Hello", "HelloWorld", "Hollis");

    }
}
