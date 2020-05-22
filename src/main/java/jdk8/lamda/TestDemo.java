package jdk8.lamda;

/**
 * @description: lamda测试
 * @packagename: jdk8.lamda
 * @author: yuanqingtao
 * @date: 2020-04-27 17:50
 **/
public class TestDemo {
    public static void main(String[] args) {
        IMessage iMessage = new IMessage() {
            @Override
            public void print(String info) {
                System.out.println(info);
            }
        };
        iMessage.print("hello world");
    }
}
