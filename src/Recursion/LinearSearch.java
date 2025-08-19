package Recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target =2;
        int index = search(arr,0,target);
        System.out.println(index);
    }

    public static int search(int[] arr,int index , int target){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return search(arr,index+1,target);
    }
}
