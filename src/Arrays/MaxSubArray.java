package Arrays;


//Leetcode 53 - https://leetcode.com/problems/maximum-subarray/
//Using Kadanes Algorithm
class MaxSubArray {
    public int maxSubArray(int[] nums) {

        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        if(nums.length == 1){
            return nums[0];
        }

        for (int num : nums) {
            sum += num;

            if (sum > maxi) {
                maxi = sum;
            }
            if (sum < 0) {
                sum = 0;
            }

        }
        return maxi;

    }
}
