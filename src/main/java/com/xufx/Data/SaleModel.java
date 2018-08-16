package com.xufx.Data;

public class SaleModel {
    private  String goods;
    private int SaleNum;

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public int getSaleNum() {
        return SaleNum;
    }

    public void setSaleNum(int saleNum) {
        SaleNum = saleNum;
    }

    @Override
    public String toString() {
        return "SaleModel{" +
                "goods='" + goods + '\'' +
                ", SaleNum=" + SaleNum +
                '}';
    }
}
