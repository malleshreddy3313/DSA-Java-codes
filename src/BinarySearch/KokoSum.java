package BinarySearch;

public class KokoSum {
    public static void main(String[] args) {
        int[] arr = {3,6,7,11};
        int h = 8;
        int ans = minHours(arr,h);
        System.out.println(ans);
    }

    public static int minHours(int[] arr, int h) {
        int n = arr.length;
        int start = 1;
        int maxi = Integer.MIN_VALUE;
        for(int i =0 ; i < n ; i++){
            if(arr[i] > maxi ){
                maxi = arr[i];
            }
        }
        int end = maxi ;

        int ans  = maxi ;

        while(start <= end){
            int mid = start + (end - start)/2;
            int totalhours = hours(arr,mid);
            if(totalhours == h){
                return mid;
            }else if(totalhours > h){
                start = mid + 1;
            }else{
                ans = mid;
                end  = mid - 1;
            }
        }
      return ans;
    }

    public static int hours(int[] arr, int mid) {
        int hours =  0 ;
        for(int i = 0 ; i < arr.length ; i++){
            hours += (int)Math.ceil((double)arr[i]/mid);
        }
        return hours;
    }
}
