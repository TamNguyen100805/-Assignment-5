package Lecture6;

import java.util.Arrays;

public class Bai6_34 {

    public static void main(String[] args) {
        int[] a1 = {12, 34, 56};
        swap(a1, 1, 2);
        System.out.println(Arrays.toString(a1));
    }
    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
