package Sorting;

import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        insertion_sort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
        public static void insertion_sort ( int[] arr, int n){
               for (int i = 1; i < n; i++) {
                   int j = i;
                   while (j > 0 && arr[j] < arr[j-1]) {
                       int temp = arr[j-1];
                       arr[j-1] = arr[j];
                       arr[j] = temp;
                       j--;
                   }
               }
        }
}

