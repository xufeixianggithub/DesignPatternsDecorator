package com.xufx.ConcreteDecorator;

import com.xufx.Component.Component;
import com.xufx.Decorator.Decorator;

public class ConcreteDecoratorB extends Decorator{
    public ConcreteDecoratorB(Component component) {
        super(component);
    }
    private void addedBehavior(){
        System.out.println("新增了方法");
    }
    public void operation() {
        super.operation();
        addedBehavior();
    }
}
