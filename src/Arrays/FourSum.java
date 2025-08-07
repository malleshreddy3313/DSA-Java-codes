package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class FourSum {
    public static void main(String[] args) {
        int[] arr = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        int target = 9;
        List<List<Integer>> list = quadraple(arr,target);
        System.out.println(list);
    }

    public static List<List<Integer>> quadraple(int[] arr, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        for(int i = 0 ; i < arr.length ; i++){
            if(i > 0 && arr[i]==arr[i-1])continue;
            for(int j = i+1 ; j < arr.length ; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) continue;

                int k = j + 1;
                int z = n - 1;
                while (k < z) {
                    long sum = arr[i];
                    sum+=arr[k];
                    sum+=arr[z];
                    sum+=arr[j];
                    if (sum == target) {
                        List<Integer> list1 = new ArrayList<>();
                        list1.add(arr[i]);
                        list1.add(arr[j]);
                        list1.add(arr[k]);
                        list1.add(arr[z]);
                        list.add(list1);
                        k++;
                        z--;

                        while(k < z && arr[k] == arr[k+1]) k++;
                        while(k < z && arr[z] == arr[z-1]) z--;
                    } else if (sum < target) {
                        k++;
                    } else {
                        z--;
                    }
                }
            }
        }
        return list;
    }
}
