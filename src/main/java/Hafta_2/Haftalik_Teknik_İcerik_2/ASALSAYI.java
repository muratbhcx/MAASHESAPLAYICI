package Hafta_2.Haftalik_Teknik_İcerik_2;

import java.util.Scanner;

public class ASALSAYI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int number = scanner.nextInt();
        if (divide(number))
            System.out.println(number + " sayısı ASALDIR ! ");
        else {
            System.out.println(number + " sayısı ASAL değildir ! ");
        }
    }
    public static boolean divide(int n) {
        if (n <= 1) return true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}