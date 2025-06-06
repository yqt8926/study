package onJava.chapt6.VarArgs;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt6.VarArgs
 * @author: yuanqingtao
 * @date: 2024-11-19 22:46
 **/
public class OptionalTrailArgs {

    static void printf(int required,String ... optional){
        System.out.print("required:"+required +"   ");
        for (String arg : optional) {
            System.out.print(arg+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printf(1,"asdas","SDF");
        printf(2,"ada");
        printf(0);
    }
}
