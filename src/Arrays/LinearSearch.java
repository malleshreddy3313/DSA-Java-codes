package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 99;
        int result= binary_search(arr,target);
        System.out.println(result);
    }
    public static int binary_search(int[] arr, int target) {
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
