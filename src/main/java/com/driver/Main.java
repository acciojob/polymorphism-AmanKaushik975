package com.driver;

public class Main {
    // Task 1
    public  static class Product {
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



        int result2 = p.product(2, 3, 4);



        double result3 = p.product(2.5, 1.5);

    }
}
