package generic;

/**
 * @description: 泛型接口的实现类
 * @packagename: generic
 * @author: yuanqingtao
 * @date: 2020-03-05 16:43
 **/
public class FruitGenerictor implements Generictor<String> {
    @Override
    public String next() {
        return null;
    }

    Generictor a = new FruitGenerictor();
}
