package Arrays;

import java.util.HashMap;
import java.util.*;

//Find the element that appears only once and all other that appears twice
public class SingleElement {
    public static void main(String[] args) {
        int[] arr ={1,1,2,2,3,4,4,5,5};
        int result =  single2(arr);
        System.out.println(result);
    }
    //better approach Time-complexity-0(N)+O(M)  space complexity -O(M)
    public static int single(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int value  = map.getOrDefault(arr[i],0);
            map.put(arr[i],value+1);
        }

        for(Map.Entry<Integer, Integer> it:map.entrySet()){
            if(it.getValue() == 1){
                return it.getKey();
            }
        }
        return -1;
    }

    //Optimal approach Time Complexity-O(N)  Space Complexity - O(1)
    public static int single2(int[] arr) {
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor = xor^arr[i];
        }
        return xor;
    }

}
