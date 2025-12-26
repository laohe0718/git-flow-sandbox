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
        // ❌ BUG: 如果 b == 0，会抛出 ArithmeticException，但方法没有声明或处理
        return a / b; // 这里在 b=0 时崩溃
    }

    /**
     * 获取两个数的最大值
     */
    public int max(int a, int b) {
        return a > b ? a : b;
    }
}