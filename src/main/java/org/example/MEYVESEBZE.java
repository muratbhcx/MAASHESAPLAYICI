package org.example;

import java.util.Scanner;

public class MEYVESEBZE {
    public static void main(String[] args) {
        double Armut = 2.14;
        double Elma = 3.67;
        double Domates = 1.11;
        double Muz = 0.95;
        double Patlıcan = 5.00;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Armut kaç kilo ? : ");
        double a = scanner.nextDouble();
        System.out.println("Elma kaç kilo ? : ");
        double b = scanner.nextDouble();
        System.out.println("Domates kaç kilo ? : ");
        double c = scanner.nextDouble();
        System.out.println("Muz kaç kilo ? : ");
        double d = scanner.nextDouble();
        System.out.println("Patlıcan kaç kilo ? : ");
        double e = scanner.nextDouble();

        double total = (a * Armut) + (b * Elma) + (c * Domates) + (d * Muz) + (e * Patlıcan);
        System.out.println("Toplam Tutar : " + total + " TL");

    }
}
