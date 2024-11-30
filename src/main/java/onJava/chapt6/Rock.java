package onJava.chapt6;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt6
 * @author: yuanqingtao
 * @date: 2024-11-13 22:04
 **/
public class Rock {
    public Rock(int param){
        System.out.println("基本类型构造器");
    }
    public Rock(Integer param){
        System.out.println("包装类型构造器");
    }
    public Rock(){

    }

    public void testBasicType(int param){
        System.out.println("基本类型方法");
    }

    public void testBasicType(Integer param){
        System.out.println("包装类型方法");
    }
}
