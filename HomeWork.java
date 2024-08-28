package Lecture6;

import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = console.nextInt();
        int[] numbers = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri phan tu thu " + (i + 1) + ": ");
            numbers[i] = console.nextInt();
            sum += numbers[i];
        }
        double average = (double) sum / n;
        System.out.printf("Gia tri trung binh cua mang la: %.1f", average);
        System.out.println("");
    }
}
