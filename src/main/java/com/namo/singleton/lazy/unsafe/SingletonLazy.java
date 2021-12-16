package com.namo.singleton.lazy.unsafe;

import org.junit.Test;

/**
 * 懒汉模式
 *
 * @author namo
 * @data 2021/12/17-12:23 AM
 * @description
 */
public class SingletonLazy {
    @Test
    public void testSingletonLazy() {
        Singleton instance = Singleton.getInstance();
        instance.testFunction();
    }

}

class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void testFunction() {
        System.out.println("单例模式的测试调用-懒汉模式");
    }
}