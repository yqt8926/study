package reflect;

/**
 * @description: 老是类
 * @packagename: reflect
 * @author: yuanqingtao
 * @date: 2020-03-16 18:27
 **/
public class Teacher implements Person {
    @Override
    public void say() {
        System.out.println("我是老师，我有说的方法，继承自父接口");
    }

    @Override
    public void eat() {
        System.out.println("我是老师，我有吃的方法，继承自父接口");
    }

    public  void teach(){
        System.out.println("我是老师，我有教的方法。");
    }
}
