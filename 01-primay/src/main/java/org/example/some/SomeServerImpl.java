package org.example.some;

public class SomeServerImpl implements SomeService{

    @Override
    public void doSomething() {
        System.out.println("yewufangfa dosomething()");
    }

    public SomeServerImpl() {
        super();
        System.out.println("SomeServerImpl()的无参构造方法");
    }
}
