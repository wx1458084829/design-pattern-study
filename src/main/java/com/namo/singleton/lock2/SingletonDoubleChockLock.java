package com.namo.singleton.lock2;

import org.junit.Test;

/**
 * 双重校验锁
 * @author namo
 * @data 2021/12/17-12:49 AM
 * @description
 */
public class SingletonDoubleChockLock {
    @Test
    public void testSingletonDoubleLock(){
        Singleton instance = Singleton.getInstance();
        instance.testFunction();
    }
}

class Singleton {

    private volatile static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void testFunction() {
        System.out.println("单例模式的测试调用-双重校验锁");
    }

}