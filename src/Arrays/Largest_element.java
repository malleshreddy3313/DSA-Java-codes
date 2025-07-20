package Arrays;


import java.util.Scanner;
import java.util.Arrays;

// Finding the largest element in the array
public class Largest_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        sort(arr,n);
        sort2(arr,n);
    }
    //Brute-force
    public static void sort(int[] arr,int n ) {
        Arrays.sort(arr);
        System.out.println(arr[n-1]);
    }

    //optimal approach
    public static void sort2(int[] arr,int n ) {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

}
