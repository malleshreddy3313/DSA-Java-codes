package Arrays;


//Leetcode 53 - https://leetcode.com/problems/maximum-subarray/
class MaxSubArray {
    public int maxSubArray(int[] nums) {

        int maxi =Integer.MIN_VALUE;
        int sum = 0;
        if(nums.length == 1){
            return nums[0];
        }

        for(int i = 0 ; i < nums.length ; i++){
            sum +=nums[i];

            if(sum > maxi){
                maxi = sum ;
            }
            if(sum < 0){
                sum = 0;
            }

        }
        return maxi;

    }
}
