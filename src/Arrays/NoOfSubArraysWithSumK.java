package Arrays;

import java.util.HashMap;
import java.util.Map;



//Finding out the no of subArrays with sum = K
//LeetCode : https://leetcode.com/problems/subarray-sum-equals-k/
public class NoOfSubArraysWithSumK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-3,1,1,1,4,2,-3};
        int k = 3;
        int ans = getNoOfSubArraysWithSumk(arr,k);
        System.out.println(ans);
    }


    public static int getNoOfSubArraysWithSumk(int[] arr, int k) {
        int n = arr.length;
        int preSum = 0;
        int count = 0 ;

        Map<Integer,Integer> map = new HashMap<>();

        map.put(0,1);

        for(int i=0;i<n;i++){
            preSum += arr[i];
            int removed  = preSum - k;

           count += map.getOrDefault(removed,0);

           map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }
        return count;
    }
}
