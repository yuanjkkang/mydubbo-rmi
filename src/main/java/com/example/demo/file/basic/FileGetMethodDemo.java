package com.example.demo.file.basic;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @description:
 * @author: yjk
 * @create: 2018-12-22 13:52
 **/
public class FileGetMethodDemo {
    @Test
    public void fileWrite() throws IOException {
        // 创建 字节输出流对象
        FileOutputStream fos = new FileOutputStream("d:/fos2.txt");

        byte[] buf = {65,66,67,90,100,121};

        //写数据
        fos.write(buf , 1 , 3);

        //关闭流对象
        fos.close();
    }
}
