package org.example;

import org.example.utils.MathUtil;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello from CI/CD Maven Demo!");
        int sum = MathUtil.add(5, 7);
        System.out.println("5 + 7 = " + sum);
    }
}
