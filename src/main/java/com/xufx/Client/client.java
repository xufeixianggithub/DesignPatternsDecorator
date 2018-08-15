package com.xufx.Client;

import com.xufx.ConcreteComponent.ConcreteComponent;
import com.xufx.ConcreteDecorator.ConcreteDecoratorA;
import com.xufx.ConcreteDecorator.ConcreteDecoratorB;

public class client {
    public static void main(String[] args) {
        ConcreteComponent c=new ConcreteComponent();
        ConcreteDecoratorA a=new ConcreteDecoratorA(c);
        ConcreteDecoratorB b=new ConcreteDecoratorB(a);
        b.operation();
        //jjj
    }
}
