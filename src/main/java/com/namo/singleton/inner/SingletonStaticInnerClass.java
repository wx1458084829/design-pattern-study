package com.namo.singleton.inner;

import org.junit.Test;

/**
 * 静态内部类实现
 *
 * @author namo
 * @data 2021/12/17-12:53 AM
 * @description
 */
public class SingletonStaticInnerClass {
    @Test
    public void testSingletonStaticInnerClass() {
        Singleton instance = Singleton.getInstance();
        instance.testFunction();
    }

}

class Singleton {

    private Singleton() {
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void testFunction() {
        System.out.println("单例模式的测试调用-静态内部类实现");
    }

}