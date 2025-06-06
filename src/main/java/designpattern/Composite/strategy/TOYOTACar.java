package designpattern.Composite.strategy;

/**
 * @version V1.0.0
 * @description:
 * @packagename: designpattern.Composite.strategy
 * @author: yuanqingtao
 * @date: 2023-08-15 22:46
 **/
public class TOYOTACar extends Car {
    public TOYOTACar() {
        this.powerInterface = new QingQiPower();
    }
}
