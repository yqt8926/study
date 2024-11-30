package onJava.chapt6.VarArgs;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt6.VarArgs
 * @author: yuanqingtao
 * @date: 2024-11-19 22:50
 **/
public class VarargType {
    static void printg(Character... args){
        System.out.print(args.getClass()+"   ");
        System.out.println("args.length:"+args.length);
    }
    static void printf(int... args){
        System.out.print(args.getClass()+"   ");
        System.out.println("args.length="+args.length);
    }

    public static void main(String[] args) {
        printg('a');
        printg();
        printf(1,2);
        printf();
        System.out.println(new long[0].getClass());
    }
}
