package BinarySearch;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int target = 5;
        int n = arr.length;
        int result = binarySearchRecursive(arr, 0, n-1, target);
        System.out.println(result);
    }

    public static int binarySearchRecursive(int[] arr, int left, int right, int target) {
        if(left > right){
            return -1;
        }
        int mid  = (left + right)/2;

        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid] > target){
            return binarySearchRecursive(arr, left, mid - 1, target);
        }else{
            return binarySearchRecursive(arr, mid + 1, right, target);
        }
    }
}
