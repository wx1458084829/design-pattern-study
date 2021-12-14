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
    public static Singleton1 getInstance() {
        if (instance1 == null) {
            instance1 = new Singleton1();
        }
        return instance1;
    }

    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton2 = Singleton1.getInstance();
        System.out.println("singleton1.hashCode() = " + singleton1.hashCode());
        System.out.println("singleton2.hashCode() = " + singleton2.hashCode());
    }
}
