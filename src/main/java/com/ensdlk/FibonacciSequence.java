package com.ensdlk;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {

        System.out.println("At which sequence do you want to stop Fibonacci series ?");

        Scanner scanner = new Scanner(System.in);

        int seq = 0;

        while (true) {
            String input = scanner.nextLine();
            try {
                seq = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please ONLY enter a number.");
            }
        }
//        System.out.println("Fibonacci series stopped at " + seq);
        System.out.println("Your Fibonacci Number at " + seq + " is " + fibonacciSeq(seq));

    }

    public static double fibonacciSeq(int seq) {

        double num1 = 0;
        double num2 = 1;
        double num3 = num1 + num2;
        for (int i = 0; i <= seq - 2; i++) {
            num3 = num1 + num2;

            //Swapping5
            num1 = num2;
            num2 = num3;
        }
        return num3;
    }
}
