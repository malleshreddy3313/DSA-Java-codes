package BinarySearch;

public class NthRoot {
    public static void main(String[] args) {
        int n = 91;
        int root = 4;
        int ans = nth_Root(n,root);
        System.out.println(ans);
    }

    public static int nth_Root(int n, int root) {
        int start = 1;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(Math.pow(mid,root) == n){
                return mid;
            }else if(Math.pow(mid,root) > n){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
