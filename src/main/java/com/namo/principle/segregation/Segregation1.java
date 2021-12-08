package com.namo.principle.segregation;

/**
 * 缺陷：
 * 1.B类和D类实现了本不该实现的方法（由于实现接口必须实现其所有的抽象方法）
 * 2.A类和C类都依赖 Interface1 ，所以最后调用的具体实现方法是由 B或者D决定
 */
public class Segregation1 {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());
        a.depend2(new B());

        C c = new C();
        c.depend2(new D());
        c.depend3(new D());
    }
}

/**
 * 方法打接口
 */
interface Interface1 {
    void method1();

    void method2();

    void method3();
}

/**
 * A类使用接口的 1，2 方法
 */
class A {
    public void depend1(Interface1 interface1) {
        interface1.method1();
    }

    public void depend2(Interface1 interface1) {
        interface1.method2();
    }
}

/**
 * C类使用接口的 2，3 方法
 */
class C {
    public void depend3(Interface1 interface1) {
        interface1.method3();
    }

    public void depend2(Interface1 interface1) {
        interface1.method2();
    }
}

/**
 * B类实现所有的方法
 */
class B implements Interface1 {

    public void method1() {
        System.out.println("B实现了method1");
    }

    public void method2() {
        System.out.println("B实现了method2");
    }

    public void method3() {
        System.out.println("B实现了method3");
    }
}

/**
 * D类实现所有的方法
 */
class D implements Interface1 {

    public void method1() {
        System.out.println("D实现了method1");
    }

    public void method2() {
        System.out.println("D实现了method2");
    }

    public void method3() {
        System.out.println("D实现了method3");
    }
}
