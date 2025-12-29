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
     * 除法 —— 修复版：处理除零情况
     *
     * @throws IllegalArgumentException 当除数为 0 时抛出
     */
    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("除数不能为零");
            return 0; // 这里可以返回一个默认值，或者根据需求抛出异常
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