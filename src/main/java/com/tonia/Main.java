package com.tonia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        double k;
        for (k = 2; k <= Math.sqrt(number); k++) {
            if (number % k == 0) {
                System.out.println("Number isn't simple");
                return;
            }
        }
            System.out.println("Number is simple");
    }
}
