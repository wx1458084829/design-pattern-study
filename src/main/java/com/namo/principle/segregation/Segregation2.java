package com.namo.principle.segregation;

public class Segregation2 {
    public static void main(String[] args) {
        A2 a2 = new A2();
        a2.depend1(new B2());
        a2.depend2(new B2());

        C2 c2 = new C2();
        c2.depend2(new D2());
        c2.depend3(new D2());

    }
}

/**
 * 公共依赖的接口
 */
interface Interface2 {
    void method2();
}

/**
 * A单独依赖的接口
 */
interface Interface21 {
    void method1();
}

/**
 * C单独依赖的接口
 */
interface Interface23 {
    void method3();
}

class A2 {
    public void depend1(Interface21 interface21) {
        interface21.method1();
    }

    public void depend2(Interface2 interface2) {
        interface2.method2();
    }
}

class C2 {
    public void depend3(Interface23 interface23) {
        interface23.method3();
    }

    public void depend2(Interface2 interface2) {
        interface2.method2();
    }
}


class B2 implements Interface2, Interface21 {

    public void method1() {
        System.out.println("B实现了method1");
    }

    public void method2() {
        System.out.println("B实现了method2");
    }
}

class D2 implements Interface2, Interface23 {


    public void method2() {
        System.out.println("D实现了method2");
    }

    public void method3() {
        System.out.println("D实现了method3");
    }
}
