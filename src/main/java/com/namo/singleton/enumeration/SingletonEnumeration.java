package com.namo.singleton.enumeration;

import org.junit.Test;

/**
 * 枚举实现
 *
 * @author namo
 * @data 2021/12/17-12:56 AM
 * @description
 */
public class SingletonEnumeration {
    @Test
    public void testSingletonEnumeration(){
        Singleton.Instance.testFunction();
    }

}

enum Singleton {
    Instance;
    public void testFunction() {
        System.out.println("单例模式的测试调用-枚举实现");
    }
}


