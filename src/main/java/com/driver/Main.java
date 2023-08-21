package com.driver;

public class Main {
    // Task 1
    static class Product {
        // Task 3
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5
        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        // Task 2
        Product p = new Product();


        int result1 = p.product(3, 4);
        System.out.println("Result 1: " + result1);


        int result2 = p.product(2, 3, 4);
        System.out.println("Result 2: " + result2);


        double result3 = p.product(2.5, 1.5);
        System.out.println("Result 3: " + result3);
    }
}
