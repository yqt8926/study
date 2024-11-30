package onJava.chapt6;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt6
 * @author: yuanqingtao
 * @date: 2024-11-19 21:01
 **/
public class Mugs {
    Mug mug1 ;
    Mug mug2;
    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
    }

    public Mugs(int marker) {
        System.out.println("Mug(int)");
    }

    public Mugs() {
        System.out.println("Mug()");
    }


    public Mugs(Mug mug1, Mug mug2) {
        System.out.println("Mug,Mug");
    }


    public static void main(String[] args) {
        System.out.println("inside main()");
        new Mugs();
        System.out.println("new Mugs() complated");
        new Mugs(1);
        System.out.println("new Mugs(int) complated");
        new Mugs(new Mug(3), new Mug(4));
        System.out.println("new Mugs(Mug,Mug) complated");
    }


}
class Mug{
//    Mugs mugs = new Mugs();
    public Mug(int marker) {
        System.out.println("Mug("+marker+")");
    }
}