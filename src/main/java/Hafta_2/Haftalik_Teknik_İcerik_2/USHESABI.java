package Hafta_2.Haftalik_Teknik_İcerik_2;

import java.util.Scanner;

public class USHESABI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        int x = scanner.nextInt();
        System.out.println("üs giriniz : ");
        int y = scanner.nextInt();
        int result = takeTheExponent(x, y);
        System.out.println(x + "^" + y + " = " + result);
    }
    public static int takeTheExponent(int a, int b) {
        if (b == 0 ) return 1;
        return a * takeTheExponent(a,  b- 1);
    }
}