package com.deng.test;

public class Man {
    public static int age = 10;
    private String name = "邓文平";


    public static int initial(int i) {
        int result = 0;
        switch (i) {
            case 1:
                result += i * 2;
            case 2:
                result = i + 1;

        }
        return result;
    }

    //全局静态变量可以直接类名引用   无需创建对象，非静态的要创建对象才能引用
    // java中没有局部的静态变量
    // 局部变量不会初始化 要赋初始值  全局变量会自动初始化
    // 局部变量在栈中，全局变量在堆中
    public static void main(String[] args) {
        System.out.println(Man.initial(3));
    }

}
