package HaftalıkTeknikİcerik3;

import java.util.Scanner;

public class MATRİSTRANSPOZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Matrisin satır sayısını giriniz: ");
        int line = scanner.nextInt();
        System.out.print("Matrisin sütun sayısını giriniz: ");
        int column = scanner.nextInt();

        int[][] matrix = new int[line][column];
        int[][] transpose = new int[column][line];

        System.out.println("Matris elemanlarını giriniz:");
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Matris " + i + "-" + j + ": ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Matrisin Transpozu:");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < line; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}





