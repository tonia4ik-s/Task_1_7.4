package com.tonia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        double k;
        int a = 1;
        for (k = 2; k <= Math.sqrt(number); k++) {
            if (number % k == 0) {
                a = 0;
                System.out.println("Number isn't simple");
                break;
            }
        }
        if (a == 1){
            System.out.println("Number is simple");
        }
    }
}
