package testextends;

/**
 * @version V1.0.0
 * @description:
 * @packagename: testextends
 * @author: yuanqingtao
 * @date: 2024-11-21 22:46
 **/
public class Test {
    public static void main(String[] args) {
        Son son = new Son("1221","@#","$#2");
        Father father = son;
        System.out.println(father);
        printf((Son) father);
    }

    static void printf (Son son){
        System.out.println(son);
    }
}
