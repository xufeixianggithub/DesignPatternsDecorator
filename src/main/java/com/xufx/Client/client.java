package com.xufx.Client;

import com.xufx.Component.GoodsSaleEbi;
import com.xufx.ConcreteComponent.ConcreteComponent;
import com.xufx.ConcreteComponent.GoodsSaleEbo;
import com.xufx.ConcreteDecorator.CheckDecorator;
import com.xufx.ConcreteDecorator.LogDecorator;
import com.xufx.Data.SaleModel;

public class client {
    public static void main(String[] args) {
        //得到业务接口,组合装饰器
        GoodsSaleEbi ebi = new LogDecorator(new CheckDecorator(new GoodsSaleEbo()));
        //准备测试数据
        SaleModel saleModel = new SaleModel();
        saleModel.setGoods("Moto手机");
        saleModel.setSaleNum(2);
        //调用业务功能
        ebi.sale("张三","张三丰", saleModel);
        ebi.sale("李四","张三丰", saleModel);
    }
}
