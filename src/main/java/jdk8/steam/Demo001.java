package main.java.jdk8.steam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo001 {
    public static void main(String[] args) {
//        Thread t1 = new Thread(()-> System.out.println("hello world"));
//        t1.start();
//        System.out.println("hello world!");
        List<String> list = Arrays.asList(new String[]{"a","e","c"});
        Collections.sort(list,(str1,str2)->str1.compareTo(str2));
        System.out.println(list.toString());
    }
}
