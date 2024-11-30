package designpattern.Composite.strategy;

/**
 * @version V1.0.0
 * @description:
 * @packagename: designpattern.Composite.strategy
 * @author: yuanqingtao
 * @date: 2023-08-15 22:31
 **/
public class ChaiYouPower implements PowerInterface {
    @Override
    public void power() {
        System.out.println("柴油动力！");
    }
}
