package onJava.chapt5;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt5
 * @author: yuanqingtao
 * @date: 2024-11-13 21:49
 **/
public class RandomBounds {
    public static void main(String[] args) {
        switch (args.length == 0 ? "" : args[0]) {
            case "lower":
                while (Math.random()!=0.0)
                    ;
                System.out.println("Prod 0.0");
                break;
            case "upper":
                while (Math.random()!=1.0)
                    ;
                System.out.println("Prod 1.0");
                break;
            default:
                System.out.println("Usage:");
                System.out.println("\tRandomBounds lower");
                System.out.println("\tRandomBounds upper");
                System.exit(1);
        }

    }

}
