package onJava.chapt3;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt3
 * @author: yuanqingtao
 * @date: 2024-11-09 21:57
 **/
 final public class TestSignature {

    final static private String s = "asda";
    static final int i = 111;

    public Integer method1(Object object, Void abc) {
        StringBuffer sb = new StringBuffer();
        System.out.println(object);
        return 1;
    }

    static private final <T> String method1(Object object) {
        return null;
    }

    public static void main(String[] args) {

    }

    static final private class AnotherClass {

    }
}


