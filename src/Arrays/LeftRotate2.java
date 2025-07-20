package Arrays;


import java.util.Scanner;

//Left-rotate the array by d-places
public class LeftRotate2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the no of digits to be rotated");
        int d = sc.nextInt()%n;
        //left_rotate2(arr, n,d % n);
         rotate2(arr,n,d);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //Brute-force approach- Time Complexity - O(n+d)
    public static void left_rotate2(int[] arr, int n,int d) {
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for(int i = d; i < n; i++) {
            arr[i-d] = arr[i];
        }
        int j = 0;
        for(int i = n-d ; i < n; i++) {
            arr[i] = temp[j];
            j++;
        }
    }

    //optimal approach Time complexity(O(2n))
    public static void rotate2(int[] arr, int n, int d) {

        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);

    }

    static void reverse(int[] arr,int start,int end) {
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
