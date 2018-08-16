package com.xufx.Client;

import com.xufx.IOtest.EncryptOutputStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Client2 {
    public static void main(String[] args) throws Exception{
        //流式输出文件
        DataOutputStream dout =
                new DataOutputStream(
                        new BufferedOutputStream(
                                new EncryptOutputStream(
                                        new FileOutputStream("MyEncrypt.txt"))));
        //然后就可以输出内容了
        dout.write("abcdxy".getBytes());
        dout.close();
    }
}
