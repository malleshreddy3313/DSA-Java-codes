package Arrays;

import java.util.HashMap;

public class LengthMaxSubArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, -2, 4, -4};
        int n = arr.length;
        int ans = maxLengthSubArray(arr,n);
        System.out.println(ans);
    }

    public static int maxLengthSubArray(int[] arr, int n) {
        int sum = 0;
        int maxi = 0;
        HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();
        for(int i=0; i<n; i++) {
            sum += arr[i];
            if(sum == 0){
                maxi = i + 1;
            }else{
                if(mpp.get(sum) != null) {
                    maxi = Math.max(maxi, i - mpp.get(sum));
                }
                else {
                    mpp.put(sum, i);
                }
            }
        }
        return maxi;
    }
}
