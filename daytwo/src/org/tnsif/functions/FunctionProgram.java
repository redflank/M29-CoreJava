//Program to demonstrate addition of two number using functions
package org.tnsif.functions;

public class FunctionProgram {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;
        System.out.println("The sum of two numbers is: " + sum);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}