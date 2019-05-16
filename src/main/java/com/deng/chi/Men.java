package com.deng.chi;

public class Men {
    public static int we = 11;

    static {
        System.out.println("父类men静态代码块");
    }

    public Men() {
        System.out.println("men构造函数");
    }
}
