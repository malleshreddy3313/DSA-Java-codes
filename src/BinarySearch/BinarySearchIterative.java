package BinarySearch;

import org.w3c.dom.ls.LSOutput;

public class BinarySearchIterative {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int target = 5;
        int n = arr.length;
        int result = binarySearchIterative(arr, 0, n-1, target);
        System.out.println(result);
    }
    public static int binarySearchIterative(int[] arr, int start, int end, int target) {

        while(start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) return mid;
            else if (arr[mid] > target) {
                end = mid - 1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }



}
