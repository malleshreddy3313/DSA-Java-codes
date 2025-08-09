package BinarySearch;

public class FloorAndCeil {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 2 ;
        int[] ans = findFloorandCeil(arr,target);
        System.out.println(ans[0] + " " + ans[1]);
    }
    public static int[] findFloorandCeil(int[] arr, int target) {
        int f = findFloor(arr,target);
        int s = findCeil(arr,target);
        return new int[]{f,s};
    }
    public static int findFloor(int[] arr, int target) {
        int n = arr.length;
        int start = 0 ;
        int end = arr.length - 1 ;
        int ans = n;

        while (start <= end) {
            int mid = (start + end) / 2;
            if(arr[mid] <= target){
                ans = arr[mid];
                start = mid+1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }

    public static int findCeil(int[] arr, int target) {
        int n = arr.length;
        int start = 0 ;
        int end = arr.length - 1 ;
        int ans = n;

        while (start <= end) {
            int mid = (start + end) / 2;
            if(arr[mid] >= target){
                ans = arr[mid];
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }
}
