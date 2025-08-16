package BinarySearch;

public class ShipCapacity {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        int ans = minDays(arr,days);
        System.out.println(ans);
    }

    public static int minDays(int[] arr, int days) {
        int maxi = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0 ;  i < arr.length ; i++){
            sum += arr[i];
            maxi = Math.max(maxi, arr[i]);
        }

        for(int cap = maxi ; cap <= sum ;cap++){
            if(reqDays(arr,cap)<=days){
                return cap;
            }
        }return -1;
    }



    public static int reqDays(int[] arr, int cap){
        int days = 1;
        int load = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (load + arr[i] > cap){
                days += 1;
                load = arr[i];
            }
             else {
                load += arr[i];
            }
        }
        return days;
    }
}
