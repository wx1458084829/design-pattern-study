package com.namo.singleton;

/**
 * 懒汉-线程不安全
 */
public class Singleton1 {
    //对象实例
    private static Singleton1 instance1;
    //私有化构造方法
    private Singleton1() {
    }
    //创建对象
    public static Singleton1 getUniqueInstance() {
        if (instance1 == null) {
            instance1 = new Singleton1();
        }
        return instance1;
    }
}
