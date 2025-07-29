package Arrays;


//Leetcode 53 - https://leetcode.com/problems/maximum-subarray/
//Using Kadanes Algorithm
class MaxSubArray {
    public static int maxSubArray(int[] nums) {

        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        if(nums.length == 1){
            return nums[0];
        }


        int arrStart = -1;
        int arrEnd = -1;
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            if(sum == 0 ) {
                start = i;
            }
            sum+=nums[i];

            if (sum > maxi) {
                maxi = sum;
                arrStart = start;
                arrEnd = i;
            }
            if (sum < 0) {
                sum = 0;
            }

        }
      for(int i = arrStart; i <= arrEnd; i++){
          System.out.print(nums[i] + " ");
      }
   return maxi;
    }

    public static void main(String[] args) {
        int[] arr = {1,-1,1,2,3,-4,-2,5};
        int result = maxSubArray(arr);
        System.out.println("Maximum Sum: " + result);

    }


}
