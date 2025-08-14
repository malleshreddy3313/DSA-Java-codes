package BinarySearch;

import java.util.*;

public class AgressiveCows {
    public static void main(String[] args) {
        int[] arr = {0, 3, 4, 7, 10, 9};
        int k = 4;
        int ans = aggresiveCows(arr,k);
        System.out.println(ans);
    }

    public static int aggresiveCows(int[] arr, int k) {
        int n = arr.length;

        Arrays.sort(arr);
        int start = arr[0];
        int end = arr[n - 1] - arr[ 0 ];

        while(start <= end) {
            int mid = start + (end - start)/2;

            if(isTrue(arr,mid,k) == true){
                start = mid+1;
            }else{
                end = mid - 1;
            }
        }

        return end;
    }


    public static boolean isTrue(int[] arr, int dist, int k) {
        int n = arr.length;
        int cntCows = 1;
        int last = arr[0];

        for(int i = 1; i < n; i++) {
            if(arr[i] - last >= dist){
                cntCows++;
                last = arr[i];
            }
            if(cntCows >= k){
                return true;
            }
        }
        return false;
    }
}
