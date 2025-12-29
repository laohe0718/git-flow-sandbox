package com.example;

public class Calculator {

    /**
     * 加法
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * 减法
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * 乘法
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * 除法 —— 【BUG】未处理除零异常！
     */
    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("除数不能为零");
            return 0; // v1.0.5 版本修复
        }
        return a / b;
    }


    /**
     * 获取两个数的最大值
     */
    public int max(int a, int b) {
        return a > b ? a : b;
    }
}