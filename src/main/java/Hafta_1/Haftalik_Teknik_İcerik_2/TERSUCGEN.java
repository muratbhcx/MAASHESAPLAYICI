package Hafta_1.Haftalik_Teknik_İcerik_2;

import java.util.Scanner;

public class TERSUCGEN {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = number; i <= j; --j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
