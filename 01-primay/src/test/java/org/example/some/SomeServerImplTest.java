package org.example.some;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

class SomeServerImplTest {

    @Test
    void doSomething() {
        String resource = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        SomeService ss = (SomeService) ac.getBean("someServer");
        ss.doSomething();
        SomeService ss1  = (SomeService) ac.getBean("someClient");
        ss1.doSomething();

    }
}