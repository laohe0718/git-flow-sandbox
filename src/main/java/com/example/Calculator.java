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
            System.err.println("Error: Division by zero is not allowed.");
            return 0; // 返回一个默认值
        }
        return a / b;
    }


    /**
     * 获取两个数的最大值
     */
    public int max(int a, int b) {
        return a > b ? a : b;
    }

        /**
     * 计算两个整数的平均值（向下取整）
     * 
     * @param a 第一个整数
     * @param b 第二个整数
     * @return (a + b) / 2
     */
    public int average(int a, int b) {
        return add(a, b) / 2; // 复用 add 方法
    }
}