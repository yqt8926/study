package designpattern.Composite.strategy;

/**
 * @version V1.0.0
 * @description:
 * @packagename: designpattern.Composite.strategy
 * @author: yuanqingtao
 * @date: 2023-08-15 22:34
 **/
public class BYDCar extends Car {
//    public BYDCar(PowerInterface powerInterface) {
//        super(powerInterface);
//    }

    public BYDCar(PowerInterface powerInterface) {
        this.powerInterface = powerInterface;
    }
}
