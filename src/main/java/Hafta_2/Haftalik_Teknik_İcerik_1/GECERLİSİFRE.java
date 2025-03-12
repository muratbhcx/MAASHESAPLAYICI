package Hafta_2.Haftalik_Teknik_İcerik_1;

import java.util.Scanner;

public class GECERLİSİFRE {
    public static boolean conditions (String password) {
        if (password.length() < 8 ) return false;
        if (password.contains(" ")) return false;
        if (!Character.isUpperCase(password.charAt(0))) return false;
        if (password.charAt(password.length() - 1) !='?') return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        do {
            System.out.println("1-Şifreniz en az 8 karakterden oluşmalı");
            System.out.println("2-Boşluk içermemeli");
            System.out.println("3-İlk karakteri büyük harf ile başlamalı");
            System.out.println("4-Son karakteri '?' olmalı");
            System.out.println("LÜTFEN BİR ŞİFRE OLUŞTURUNUZ : ");
            password = scanner.nextLine();
            if (!conditions(password)) {
                System.out.println("GEÇERSİZ ŞİFRE ! LÜTFEN TEKRAR DENEYİN.");
            }
        }    while (!conditions(password));
            System.out.println("GEÇERLİ ŞİFRE ! ");
    }
}