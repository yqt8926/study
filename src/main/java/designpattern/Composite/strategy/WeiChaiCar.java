package designpattern.Composite.strategy;

/**
 * @version V1.0.0
 * @description:
 * @packagename: designpattern.Composite.strategy
 * @author: yuanqingtao
 * @date: 2023-08-15 22:41
 **/
public class WeiChaiCar extends Car {
    public WeiChaiCar(PowerInterface powerInterface) {
        this.powerInterface = powerInterface;
    }
}
