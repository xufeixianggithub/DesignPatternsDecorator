package com.xufx.ConcreteComponent;

import com.xufx.Component.Component;

import java.util.Date;

public class ConcreteComponent extends Component{
    public double calcPrize(String user, Date begin, Date end) {
        //只是一个默认的实现，默认没有奖金
        return 0;
    }
}
