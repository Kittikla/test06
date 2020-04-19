package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = 0;
        while (true) {
            int n = in.nextInt();
            int price = 0;

            if (n <= 0) {
                System.out.println(total);
                break;
            }
        int p = in.nextInt();
        int take_away = in.nextInt();
        if (take_away != 0) {
            price += 10;
            System.out.println((n * p) + price);
            total = total + ((n * p) + price);
        } else {
            System.out.println((n * p) + price);
            total = total + ((n * p) + price);
        }
    }
    }
}

