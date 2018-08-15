package com.xufx.ConcreteDecorator;

import com.xufx.Component.Component;
import com.xufx.Decorator.Decorator;

public class ConcreteDecoratorA extends Decorator{
    public ConcreteDecoratorA(Component component) {
        super(component);
    }
    public void operation(){
        super.operation();
        System.out.println("增加了操作");
    }
}
