package onJava.chapt6;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt6
 * @author: yuanqingtao
 * @date: 2024-11-14 21:01
 **/
public class Apple {

    public Apple getPeeled(){
        return Peeled.peel(this);
    }
}
