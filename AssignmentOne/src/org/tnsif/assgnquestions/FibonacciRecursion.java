package org.tnsif.assgnquestions;

import java.util.Scanner;

public class FibonacciRecursion {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Invalid input! Please enter a positive integer.");
        } else {
            int result = fibonacci(n);
            System.out.println("The nth term in the Fibonacci series is: " + result);
        }
    }
}
