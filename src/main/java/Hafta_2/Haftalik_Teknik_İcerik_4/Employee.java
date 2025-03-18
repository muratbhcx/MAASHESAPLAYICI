package Hafta_2.Haftalik_Teknik_İcerik_4;

import java.util.Scanner;

public class Employee {
    public String name;
    public int salary;
    public int workHours;
    public int hireYear;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adınızı Giriniz : ");
        String name = scanner.next();
        System.out.println("Maaşınızı Giriniz : ");
        int salary = scanner.nextInt();
        System.out.println("Haftalık Çalışma Saatinizi Giriniz : ");
        int workHours = scanner.nextInt();
        System.out.println("İşe Başladığınız Yılı Giriniz : ");
        int hireYear = scanner.nextInt();
        Employee employee = new Employee(name, salary, workHours, hireYear);
        System.out.println(employee);
    }

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public int tax() {
        if (salary > 1000 ){
           return (salary * 3) / 100;
        }
        return 0;
    }

    public int bonus() {
        if (workHours > 40 ){
            return (workHours - 40) * 30;
        }
        return 0;
    }

    public int raiseSalary() {
        if (2021 - hireYear < 10) {
            return (salary * 5) / 100;
        } else if (2021 - hireYear > 9 && 2021 - hireYear < 20) {
            return (salary * 10) / 100;
        } else if (2021 - hireYear > 19) {
            return (salary * 15) / 100;
        }
        return 0;
    }

    @Override
    public String toString() {
        return  "Adı : " + name + "\n" +
                "Maaşı : " + salary + " TL" +"\n" +
                "Haftalık Çalışma Saati : " + workHours + " Saat" + "\n" +
                "Başlangıç Yılı : " + hireYear + "\n" +
                "Vergi : " + tax() + " TL" +"\n" +
                "Bonus : " + bonus() + " TL" + "\n" +
                "Maaş Artışı : " + raiseSalary() + " TL" + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş : " + ((salary - tax()) + bonus()) + " TL" + "\n" +
                "Toplam Maaş : " + ((salary - tax()) + bonus() + raiseSalary()) + " TL";
    }
}