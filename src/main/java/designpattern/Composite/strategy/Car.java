package designpattern.Composite.strategy;

/**
 * @version V1.0.0
 * @description:
 * @packagename: designpattern.Composite.strategy
 * @author: yuanqingtao
 * @date: 2023-08-15 22:27
 **/
public abstract class Car {

    protected PowerInterface powerInterface;

    public Car() {
    }

    public Car(PowerInterface powerInterface) {
        this.powerInterface = powerInterface;
    }

    public void setPowerInterface(PowerInterface powerInterface) {
        this.powerInterface = powerInterface;
    }

    protected void power(){
        powerInterface.power();
    }

    public void open(){
        System.out.println("这是公共的启动汽车的方法");
    }
    public void closed(){
        System.out.println("这是公共的熄火汽车的方法");
    }
}
