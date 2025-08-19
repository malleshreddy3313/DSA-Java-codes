package BinarySearch;

import java.util.Arrays;

public class Search2DMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int target = 7;
        int[] index = searchTarget(arr,target);
        System.out.println(Arrays.toString(index));
    }

    public static int[] searchTarget(int[][] arr, int target) {
        int n = arr.length;
        int m = arr[0].length;

        int low = 0;
        int high = n + m - 1;


        while (low <= high) {
            int mid = (low + high) / 2;
            int row = mid / m; int col = mid % m;
            if(arr[row][col] == target){
                return new int[]{row,col};
            }else if(arr[row][col] > target){
                    high = mid - 1;

            }else{
                low = mid + 1;
            }
        }
        return new int[]{-1,-1};
    }
}
