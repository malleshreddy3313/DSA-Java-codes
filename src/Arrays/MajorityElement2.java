package Arrays;

import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,3,3};
        List<Integer> ans  = majorityElement(arr);
        System.out.println(ans);
    }

    public static List<Integer> majorityElement(int[] nums) {
        int ele1 = Integer.MAX_VALUE;
        int ele2 = Integer.MAX_VALUE;
        List<Integer> ans = new ArrayList<>();
        int  n = nums.length;

        int count1 = 0;
        int count2 = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(count1 == 0 && nums[i] != ele2){
                count1 = 1;
                ele1 = nums[i];
            }else if(count2 == 0 && nums[i] != ele1){
                count2 = 1;
                ele2 = nums[i];
            }
            else if(nums[i] == ele1){
                count1++;
            }
            else if(nums[i] == ele2){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == ele1 ) count1++;
            if(nums[i] == ele2) count2++;
        }

        int mini = (int)(n / 3) + 1;
        if (count1 >= mini) ans.add(ele1);
        if (count2  >= mini) ans.add(ele2);

        return ans;
    }
}
