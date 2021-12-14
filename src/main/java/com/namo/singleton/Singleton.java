package com.namo.singleton;

/**
 * 懒汉-线程不安全
 */
public class Singleton {
    //对象实例
    private static Singleton instance;
    //私有化构造方法
    private Singleton() {
    }
    //创建对象
    public static Singleton getUniqueInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
