package com.namo.singleton.example;

import org.junit.Test;

import java.io.IOException;
import java.io.OutputStream;

/**
 * @author namo
 * @data 2021/12/16-11:38 PM
 * @description
 */
public class Example1 {
    @Test
    public void testExample() {
        //Runtime类使用单例模式
        Runtime runtime = Runtime.getRuntime();
        try {
            Process dir = runtime.exec("ifconfig");

            OutputStream outputStream = dir.getOutputStream();

            System.out.println(outputStream);
            for (int i = 0; i < 100; i++) {
                int a = 0;
                outputStream.write(a);
                System.out.println(String.valueOf(a));
                if (a == 0) {
                    break;
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
