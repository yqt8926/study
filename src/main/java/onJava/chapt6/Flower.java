package onJava.chapt6;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt6
 * @author: yuanqingtao
 * @date: 2024-11-14 21:15
 **/
public class Flower {
    int petalCount = 0;
    String s = "initial value";

    public Flower(int petals) {
//        Flower();
//        this.petalCount = petals;
//        System.out.println("constructor w/ int arg only petalCount = " + petals);

    }

    public Flower(String s) {
        this.s = s;
        System.out.println("constructor w/ String arg only s = " + s);
    }

    public Flower(int petalCount, String s) {
//        Flower();
        this(petalCount);
//        this(s);
        this.s = s;
        System.out.println("constructor w/ String & int arg ");
    }

    public Flower() {
        this(47,"hi");
//        Flower(47,"hi");
        System.out.println("no arg constructor ");
    }
    void printCount(){
//        this();
        System.out.println("petalCount = " + petalCount + " s = " + s);
    }

//    static void testStatis(Object object){
//        this.printCount();
//    }
    public static void main(String[] args) {
        new Flower().printCount();
    }
}
