package org.example;

import java.util.Scanner;

public class ZODYAK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Doğum Yılınızı Giriniz : ");
        int year = scanner.nextInt();

        int zodiac = year % 12;
        String hayvan;
        if (zodiac == 0)
            hayvan = "Maymun";
        else if (zodiac == 1)
        hayvan = "Horoz";
        else if (zodiac == 2)
        hayvan = "Köpek";
        else if (zodiac == 3)
        hayvan = "Domuz";
        else if (zodiac == 4)
        hayvan = "Fare";
        else if (zodiac == 5)
        hayvan = "Öküz";
        else if (zodiac == 6)
        hayvan = "Kaplan";
        else if (zodiac == 7)
        hayvan = "Tavşan";
        else if (zodiac == 8)
        hayvan = "Ejderha";
        else if (zodiac == 9)
        hayvan = "Yılan";
        else if (zodiac == 10)
        hayvan = "At";
        else if (zodiac == 11)
        hayvan = "Koyun";
        else
            hayvan = "Hatalı Girdiniz !";




        System.out.println(hayvan);

        {

        }
        {

        }
        {

        }
        {
        }
        {

        }
        {

        }
        {

        }
        {

        }
        {

        }
        {

        }
        {

        }

    }
}
