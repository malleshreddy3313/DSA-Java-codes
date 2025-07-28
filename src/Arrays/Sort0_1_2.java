package Arrays;




//sorting 0,1,2 using DUTCH NATIONAL FLAG ALGORITHM
public class Sort0_1_2 {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 1, 2, 0, 0, 0, 1, 2, 1, 2};
        int n = arr.length;

        sort1(arr,0,n);
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void sort1(int[] arr, int low, int n) {
        int mid = 0 ;
        int high = n-1;
        while (mid <= high) {
            if(arr[mid] == 0){
                swap(arr,low,mid);
                low++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                swap(arr,mid,high);
                high--;
            }
        }

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
