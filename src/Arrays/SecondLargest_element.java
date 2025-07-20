package Arrays;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
import java.util.*;

//Finding the second largest element in the array
public class SecondLargest_element {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the no of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        sec_largest(arr,n);
        sec_largest_better(arr,n);
        sec_largest_optimal(arr,n);

    }

    //Bruteforce approach (Time complexity: o(NlogN)
    public static void sec_largest(int[] arr, int n) {
        Arrays.sort(arr);
        int largest = arr[n-1];
        int slargest = 0;
        for(int i = n-2; i >= 0; i--) {
            if(arr[i] != largest) {
                slargest = arr[i];
                break;
            }
        }
        System.out.println(slargest);
    }

    //Better - approach (Time Complexity - O(2N)
    public static void sec_largest_better(int[] arr, int n) {
        int largest = arr[0];
        for(int i = 0; i < n; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }

        int slargest = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] < largest && arr[i] > slargest) {
                slargest = arr[i];
            }
        }
        System.out.println(slargest);
    }

   //optimal approach (Time complexity:O(N)
    public static void sec_largest_optimal(int[] arr, int n) {
        int largest = arr[0];
        int secondLargest = -1;
        for(int i = 1; i < n; i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}
