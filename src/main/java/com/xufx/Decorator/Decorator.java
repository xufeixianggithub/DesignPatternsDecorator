package com.xufx.Decorator;

import com.xufx.Component.Component;

public abstract class Decorator extends Component{
    protected Component component=null;

    public Decorator(Component component) {
        this.component=component;
    }
    public  void operation(){
        component.operation();
    }
}
