package onJava.chapt6.enumtest;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt6.enumtest
 * @author: yuanqingtao
 * @date: 2024-11-20 22:04
 **/
public class Brrito {
    private Spiciness spiciness;

    public Brrito(Spiciness spiciness) {
        this.spiciness = spiciness;
    }

    public void decribe(){
        switch (spiciness) {
            case HOT:
                System.out.println("hot");
                break;
            case NOT:
                System.out.println("not");
                break;
            case MILD:
                System.out.println("sadas");
            case MEDIUM:
            case FLAMING:
                System.out.println("efwewe");
                break;
            default:
                System.out.println("asdqwqwd");
        }
    }
}
