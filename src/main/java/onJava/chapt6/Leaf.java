package onJava.chapt6;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt6
 * @author: yuanqingtao
 * @date: 2024-11-14 20:55
 **/
public class Leaf {
    private int i;
    Leaf incrment(){
        i++;
        return this;
    }

    private void printf(){
        System.out.println(i);
    }

    public static void main(String[] args) {
        Leaf leaf = new Leaf();
        leaf.incrment().incrment().incrment().printf();
    }
}
