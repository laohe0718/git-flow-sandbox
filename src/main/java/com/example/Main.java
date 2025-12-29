package com.example;


public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("5 + 3 = " + calc.add(5, 3));
        System.out.println("5 - 3 = " + calc.subtract(5, 3));
        System.out.println("5 * 3 = " + calc.multiply(5, 3));

        try {
            System.out.println("5 / 0 = " + calc.divide(5, 0));
        } catch (Exception e) {
            System.out.println("错误：" + e.getMessage());
        }

        System.out.println("Max(5, 3) = " + calc.max(5, 3));
        System.out.println("Average(5, 3) = " + calc.average(5, 3)); // ← 新增
    }
}