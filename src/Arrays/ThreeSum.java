package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        int n = arr.length;
        List<List<Integer>> list = triplet(arr ,n);
        System.out.println(list);
    }

    private static List<List<Integer>> triplet(int[] arr, int n) {
        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(arr);

        for(int i=0;i<n;i++){
            if(i!=0 && arr[i]==arr[i-1])continue;

            int j = i+1;
            int k = n-1;

            while(j < k){
                int sum = arr[i]+arr[j]+arr[k];
                if(sum < 0){
                   j++;
                }else if(sum > 0){
                    k--;
                }else{
                    list.add(Arrays.asList(arr[i],arr[j],arr[k]));
                    j++;
                    k--;

                    while(j < k && arr[j]==arr[j-1]){j++;}
                    while(j < k && arr[k]==arr[k-1]){k++;}
                }
            }


        }
        return list;
    }
}
