package BinarySearch;

public class RotatedArray {
    public static void main(String[] args) {
        int[] arr = {7,8,9,1,2,3,4,5,6};
        int target = 7;
        int index = searchInSortedArray(arr,target);
        System.out.println(index);
    }

    public static int searchInSortedArray(int[] arr, int target) {
        int index = -1;
        int n = arr.length;
        int left = 0 ;
        int right = n-1;

        while(left <= right) {
            int mid = left + (right - left)/2;
            if(arr[mid] == target) {
                return mid;
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
                    left = mid+1;
                }else{
                    right = mid - 1;
                }
            }
        }

        return index;
    }

}
