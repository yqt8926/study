package designpattern.Composite.strategy;

/**
 * @version V1.0.0
 * @description:
 * @packagename: designpattern.Composite.strategy
 * @author: yuanqingtao
 * @date: 2023-08-15 22:39
 **/
public class BMWCar extends Car {
    public BMWCar(PowerInterface powerInterface) {
        this.powerInterface = powerInterface;
    }
}
