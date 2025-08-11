package BinarySearch;

public class MinDaysForBouquet {
    public static void main(String[] args) {
        int[] arr = {7, 7, 7, 7, 13, 11, 12, 7};
        int k = 2;
        int m = 3;
        int ans = roseGarden(arr,k,m);
        System.out.println(ans);
    }

    private static int roseGarden(int[] arr, int m, int k) {

        long val = (long) m * k;
        int n = arr.length;
        if (val > n) return -1;
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;

        for(int i = 0 ; i < arr.length ; i++){
            mini = Math.min(mini, arr[i]);
            maxi = Math.max(maxi, arr[i]);
        }

        int low = mini, high = maxi;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (possible(arr, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static boolean possible(int[] arr, int day, int m, int k) {
        int n = arr.length; // Size of the array
        int cnt = 0;
        int noOfB = 0;
        // Count the number of bouquets:
        for (int i = 0; i < n; i++) {
            if (arr[i] <= day) {
                cnt++;
            } else {
                noOfB += (cnt / k);
                cnt = 0;
            }
        }
        noOfB += (cnt / k);
        return noOfB >= m;
    }
}
