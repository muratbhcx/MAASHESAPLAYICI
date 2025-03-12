package Hafta_1.Haftalik_Teknik_İcerik_1;

import java.util.Scanner;

public class BOYKILO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        double size = scanner.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz:");
        double weight = scanner.nextDouble();

        double index = weight / (size * size);
        System.out.println("Vücut Kitle İndeksiniz: " + index);



    }
}
