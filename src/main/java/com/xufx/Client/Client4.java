package com.xufx.Client;
import com.xufx.IOtest.EncryptOutputStream2;

import java.io.*;
public class Client4 {
    public static void main(String[] args) throws Exception {
        //流式输出文件
        DataOutputStream dout =
                new DataOutputStream(
                        new EncryptOutputStream2(
                                new BufferedOutputStream(

                                        new FileOutputStream("MyEncrypt.txt"))));
        //然后就可以输出内容了
        dout.write("abcdxy".getBytes());
        dout.close();
    }
}
