package com.namo.singleton;
/**
 * 懒汉-线程安全（加锁）
 */
public class Singleton2 {

    //对象实例
    private static Singleton2 instance2;

    //私有化构造方法
    private Singleton2() {
    }

    /**
     * 实例化方法加锁，保证线程安全
     * @return
     */
    public static synchronized Singleton2 getInstance() {
        if (instance2 == null) {
            instance2 = new Singleton2();
        }
        return instance2;
    }

    public static void main(String[] args) {
        Singleton2 instance1 = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
        System.out.println("instance1.hashCode() = " + instance1.hashCode());
        System.out.println("instance2.hashCode() = " + instance2.hashCode());
    }

}

