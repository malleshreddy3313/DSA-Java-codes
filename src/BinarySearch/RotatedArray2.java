package BinarySearch;

public class RotatedArray2 {
    public static void main(String[] args) {
        int[] arr = {7,7,7,9,1,2,3,4,5,6};
        int target = 7;
        Boolean presentornot = searchInSortedArray(arr,target);
        System.out.println(presentornot);
    }

    public static Boolean searchInSortedArray(int[] arr, int target) {
        int index = -1;
        int n = arr.length;
        int left = 0 ;
        int right = n-1;

        while(left <= right) {
            int mid = left + (right - left)/2;
            if(arr[mid] == target) {
                return true;
            }
            if(arr[left] == arr[mid] && arr[mid] == arr[right]){
                left++;
                right--;
            }
            if(arr[left] <= arr[mid]){
                if(arr[left] <= target && target <= arr[mid]) {
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }

            }
            else{
                if(target >= arr[mid] && target <= arr[right]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }

        return false;
    }
}
