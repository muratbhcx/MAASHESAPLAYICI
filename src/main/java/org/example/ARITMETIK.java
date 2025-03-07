package org.example;

import java.util.Scanner;

public class ARITMETIK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a değerini giriniz : ");
        int a = scanner.nextInt();
        System.out.println("b değerini giriniz : ");
        int b = scanner.nextInt();
        System.out.println("c değerini giriniz : ");
        int c = scanner.nextInt();
        int sonuc = a+(b*c)-b;
        System.out.println("Sonuç : " + sonuc);

    }
    }

