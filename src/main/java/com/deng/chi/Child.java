package com.deng.chi;

public class Child extends Men {
    static {
        System.out.println("子类静态代码块");
    }

    public Child() {
        System.out.println("子类构造函数");
    }
}
