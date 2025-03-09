package HaftalıkTeknikİcerik2;

import java.util.Scanner;

public class ORTHESAP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int number = scanner.nextInt();
        int total = 0;
        int element = 0;

        for (int i = 1; i <= number; i++)
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);
                total += i;
                element++;
            }
            int avg = total / element;
            System.out.println("Ortalama : " + avg);





    }
}
