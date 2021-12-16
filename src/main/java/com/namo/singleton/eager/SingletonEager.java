package com.namo.singleton.eager;

import org.junit.Test;

/**
 * 饿汉模式
 *
 * @author namo
 * @data 2021/12/17-12:27 AM
 * @description
 */
public class SingletonEager {
    @Test
    public void testSingletonEager() {
        Singleton instance = Singleton.getInstance();
        instance.testFunction();
    }
}

/**
 * 饿汉模式
 */
class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }

    public void testFunction() {
        System.out.println("单例模式的测试调用-饿汉模式");
    }
}




