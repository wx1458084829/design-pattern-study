package com.namo.singleton.lazy.safe;

import org.junit.Test;

/**
 * 懒汉模式-线程安全
 *
 * @author namo
 * @data 2021/12/17-12:41 AM
 * @description
 */
public class SingletonLazySafe {
    @Test
    public void testSingletonLazySafe() {
        Singleton instance = Singleton.getInstance();
        instance.testFunction();
    }
}

/**
 * 懒汉模式
 */
class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void testFunction() {
        System.out.println("单例模式的测试调用-懒汉模式-线程安全");
    }
}

