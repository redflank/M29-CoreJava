package org.tnsif.assgnquestions;

import java.util.Scanner;

public class SumOfDigits {
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 10 + sumOfDigits(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Invalid input! Please enter a non-negative integer.");
        } else {
            int result = sumOfDigits(n);
            System.out.println("The sum of digits in the number is: " + result);
                       
        }
        
       
    }
    
    
}
