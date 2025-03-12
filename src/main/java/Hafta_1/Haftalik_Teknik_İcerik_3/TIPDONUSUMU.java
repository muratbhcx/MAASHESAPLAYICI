package Hafta_1.Haftalik_Teknik_İcerik_3;

import java.util.Scanner;

public class TIPDONUSUMU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir tam sayı giriniz : ");
        int integer = scanner.nextInt();
        System.out.println("Bir ondalıklı sayı giriniz : ");
        double decimal = scanner.nextDouble();
        double decimalnumber = integer;
        System.out.println("Tam sayının ondalıklı sayıya dönüşümü : " + decimalnumber);
        int integer1 = (int) decimal;
        System.out.println("Ondalıklı sayının tam sayıya dönüşümü : " +integer1);
    }
}
