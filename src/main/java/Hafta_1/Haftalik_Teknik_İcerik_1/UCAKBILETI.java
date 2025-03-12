package Hafta_1.Haftalik_Teknik_İcerik_1;

import java.util.Scanner;

public class UCAKBILETI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mesafeyi km türünden giriniz : ");
        int distance = scanner.nextInt();
        System.out.println("Yaşınızı giriniz : ");
        int age = scanner.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş) : ");
        int journey = scanner.nextInt();

        if (distance < 0 || age < 0 || (journey != 1 && journey != 2))
            System.out.println("Hatalı Veri Girdiniz !");
        else {
            double price = distance * 0.10;
            double agediscount = 0;


            if (age < 12) {
                agediscount = (price / 2);
            } else if (age >= 12 && age < 24) {
                agediscount = price * 0.10;
            } else if (age > 65) {
                agediscount = price * 0.30;
            }
            price -= agediscount;
            if (journey == 2) {
                price -= price * 0.20;
                price *= 2;

            }
            System.out.printf("Toplam Tutar = %.2f TL\n", price);







        }
    }
}












