package BinarySearch;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {13,12,10};
        int peak = findPeak(arr);
        System.out.println(peak);
    }

    public static int findPeak(int[] arr) {

        int n = arr.length;
        int left = 0;
        int right = n-1;

        if(arr[left] > arr[left + 1]){
            return left;
        }
        if(arr[right] > arr[right - 1]){
            return right;
        }

        while(left <= right){
            int mid = (left + right)/2;
            if((arr[mid] > arr[mid -1 ])&&(arr[mid] > arr[mid+1])){
                return mid;
            }
            if(arr[mid] > arr[mid + 1]){
                right = mid - 1;
            }
            else if(arr[mid] > arr[mid-1]){
                left = mid + 1;
            }
        }

        return -1;
    }


}
