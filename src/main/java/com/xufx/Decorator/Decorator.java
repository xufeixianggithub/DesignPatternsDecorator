package com.xufx.Decorator;

import com.xufx.Component.Component;

import java.util.Date;

public abstract class Decorator extends Component{
    protected Component component=null;

    public Decorator(Component component) {
        this.component=component;
    }
    public double calcPrize(String user, Date begin, Date end) {
        //转调组件对象的方法
        return component.calcPrize(user, begin, end);
    }
}
