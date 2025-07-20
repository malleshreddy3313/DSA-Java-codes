package Arrays;

import java.util.Scanner;

//left rotate the given array by 1 digit
//Time - complexity - O(N0
public class LeftRotate {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        left_rotate(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void left_rotate(int[] arr, int n) {
        int temp = arr[0];
        for(int i=1;i < n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
    }
}
