package designpattern.Composite.strategy;

/**
 * @version V1.0.0
 * @description:
 * @packagename: designpattern.Composite.strategy
 * @author: yuanqingtao
 * @date: 2023-08-15 22:42
 **/
public class TestStrategy {
    public static void main(String[] args) {
        Car weichai = new WeiChaiCar(new ChaiYouPower());
        weichai.power();
        weichai.open();
        weichai.closed();
        weichai.setPowerInterface(new QingQiPower());
        weichai.power();
        weichai.open();
        weichai.closed();

        Car toyotaCar = new TOYOTACar();
        toyotaCar.power();
        toyotaCar.open();
        toyotaCar.closed();
    }
}
