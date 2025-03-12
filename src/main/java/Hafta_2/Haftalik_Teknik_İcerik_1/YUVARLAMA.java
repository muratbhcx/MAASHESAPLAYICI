package Hafta_2.Haftalik_Teknik_İcerik_1;

import java.util.Scanner;

public class YUVARLAMA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ondalıklı sayı giriniz : ");
        double number = scanner.nextDouble();
        int lower = (int)Math.floor(number);
        int top = (int)Math.ceil(number);
        int close = (int)Math.round(number);
        System.out.println("Aşağı Yuvarlama : " + lower);
        System.out.println("Yukarı Yuvarlama : " + top);
        System.out.println("En Yakın Tam Sayı : " + close);
    }
}
