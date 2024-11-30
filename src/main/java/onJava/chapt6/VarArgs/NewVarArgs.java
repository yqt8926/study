package onJava.chapt6.VarArgs;

import com.sun.tools.javac.util.List;

import java.util.ArrayList;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt6.VarArgs
 * @author: yuanqingtao
 * @date: 2024-11-19 22:33
 **/
public class NewVarArgs {
    static void printf(Object... args){
        for (Object arg : args) {
            System.out.print(arg+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printf(11,22,3,4,435,456);
        printf("ewe","Sfd","few");
        printf(new A(),new A(),new A());
        printf((Object) new Integer[]{123,123,23,34,45,4565,56});
        printf((Object[]) new Integer[]{123,123,23,34,45,4565,56});
        printf(new Integer[]{123,123,23,34,45,4565,56});
        printf(List.of(12,23,45,56));
//        printf(List(123,23,45,2332));

//        Integer... ai = new Integer[]{12,12};
        basicPrintf(11,21,23,3434);
    }

    static void basicPrintf(int... args){
        for (int arg : args) {
            System.out.print(arg+"  b  ");
        }
        System.out.println();
    }
}
class B{}
