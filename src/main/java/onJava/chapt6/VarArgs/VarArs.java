package onJava.chapt6.VarArgs;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt6.VarArgs
 * @author: yuanqingtao
 * @date: 2024-11-19 22:07
 **/
public class VarArs {
    static void printfArgs(Object[] args){
        for(Object arg:args){
            System.out.print(arg+" ");
        }
        System.out.println("      ");
    }

    public static void main(String[] args) {
        printfArgs(new Object[]{11,22,33,(float)22.22,22L});
        printfArgs(new String[]{"qwqw","Wew","werwe"});
        printfArgs(new Object[]{new A(),new A(),new A()});
    }
}
class A{}
