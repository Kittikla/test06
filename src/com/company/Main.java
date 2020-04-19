package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            int x = in.nextInt();
            if (x >= 80) {
                System.out.printf("4 ");
            } else if (x >= 75){
                System.out.printf("3.5 ");
            } else if (x >= 70){
                System.out.printf("3 ");
            } else if (x >= 65){
                System.out.printf("2.5 ");
            } else if (x >= 60){
                System.out.printf("2 ");
            } else if (x >= 55){
                System.out.printf("1.5 ");
            } else if (x >= 50){
                System.out.printf("1 ");
            } else if (x > 50){
                System.out.printf("0 ");
            }


        }
    }
}