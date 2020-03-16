package generic.method;

/**
 * @description: 泛型方法测试2
 * @packagename: generic.method
 * @author: yuanqingtao
 * @date: 2020-03-05 18:07
 **/
public class GenericMethodDemo01 {

    public <E> void genericMethod(E e){
        System.out.println(e.toString());

    }

}
