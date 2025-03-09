package HaftalıkTeknikİcerik2;

import java.util.Scanner;

public class MUKEMMELSAYI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz : ");
        int number = scanner.nextInt();
        int total = 0;
        for (int i = 1; i < number; i++)
            if (number % i == 0) {
                total += i;
            }
        if (total == number)
        System.out.println(number + " Mükemmel sayıdır.");
        else {
            System.out.println(number + " Mükemmel sayı değildir.");
        }
    }
}
