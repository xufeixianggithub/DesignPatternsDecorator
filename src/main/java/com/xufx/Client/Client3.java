package com.xufx.Client;

import com.xufx.IOtest.EncryptOutputStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Client3 {//失败案例 close 方法不属于被装饰的方法，递归调用的时候不会调用传入的被装饰对象的close方法，直接调用所继承的父类close方法
    // 所以当调用到EncryptOutputStream的close 方法时，
    // 调用父类的OutputStream的close方法，而OutputStream这个方法是空方法，不会强制BufferedOutputStream输出缓存的流
    // （由于BufferedOutputStream流是一个带缓存的流，它默认缓存8192byte，也就是默认
    //流中的缓存数据到了8192byte，它才会自动输出缓存中的数据）
    public static void main(String[] args) throws Exception {
        //流式输出文件
        DataOutputStream dout =
                new DataOutputStream(
                        new EncryptOutputStream(
                                new BufferedOutputStream(
                                        new FileOutputStream("MyEncrypt.txt"))));
        //然后就可以输出内容了
        dout.write("abcdxy".getBytes());
        dout.close();
    }
}
