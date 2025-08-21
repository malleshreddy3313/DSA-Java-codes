package Arrays;
import java.util.*;




public class ArrangeBySign {
    public static void main(String[] args) {
        int[] arr= {1,2,-1,-2,-3,3};
        int[] newarr = arrangeBySign(arr);
        System.out.println(Arrays.toString(newarr));


    }

    public static int[] arrangeBySign(int[] arr) {
        int[] ans = new int[arr.length];

        int posIndex = 0;
        int negIndex = 1;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                ans[negIndex] = arr[i];
                negIndex=negIndex+2;
            }
            if(arr[i] > 0) {
                ans[posIndex] = arr[i];
                posIndex=posIndex+2;
            }
        }
        return ans;
    }
}
