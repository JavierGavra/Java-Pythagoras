package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String menu;

        System.out.println("\t*");
        System.out.println("\t*  *");
        System.out.println(" A\t*  *  *\t   C");
        System.out.println("\t*  *  *  *");
        System.out.println("\t*  *  *  *  *");
        System.out.println("\t\t  B");
        System.out.println("\nIngin mencari sisi yg mana?");
        System.out.print("A / B / C  = ");
        menu = input.next();

        if (menu.equalsIgnoreCase("A")) {
            sisiA();

        } else if (menu.equalsIgnoreCase("B")) {
            sisiB();

        } else if (menu.equalsIgnoreCase("C")) {
            sisiC();

        } else {
            System.out.println("Kalo input yg bener woi!!!");
        }

    }

    private static void sisiA() {
        Scanner input = new Scanner(System.in);
        double A, B, C;

        System.out.println("\n## Sisi A ##");
        System.out.print("Masukkan panjang B = ");
        B = input.nextDouble();
        System.out.print("Masukkan panjang C = ");
        C = input.nextDouble();
        A = Math.sqrt(((C*C) - (B*B)));
        System.out.println("Hasil panjang sisi A = " +A);
    }

    private static void sisiB() {
        Scanner input = new Scanner(System.in);
        double A, B, C;

        System.out.println("\n## Sisi B ##");
        System.out.print("Masukkan panjang A = ");
        A = input.nextDouble();
        System.out.print("Masukkan panjang C = ");
        C = input.nextDouble();
        B = Math.sqrt(((C*C) - (A*A)));
        System.out.println("Hasil panjang sisi A = " +B);
    }

    private static void sisiC() {
        Scanner input = new Scanner(System.in);
        double A, B, C;

        System.out.println("\n## Sisi C ##");
        System.out.print("Masukkan panjang A = ");
        A = input.nextDouble();
        System.out.print("Masukkan panjang B = ");
        B = input.nextDouble();
        C = Math.sqrt(((A*A) + (B*B)));
        System.out.println("Hasil panjang sisi A = " +C);
    }
}
