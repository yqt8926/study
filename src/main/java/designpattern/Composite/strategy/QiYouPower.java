package designpattern.Composite.strategy;

/**
 * @version V1.0.0
 * @description:
 * @packagename: designpattern.Composite.strategy
 * @author: yuanqingtao
 * @date: 2023-08-15 22:30
 **/
public class QiYouPower implements PowerInterface {
    @Override
    public void power() {
        System.out.println("汽油动力");
    }
}
