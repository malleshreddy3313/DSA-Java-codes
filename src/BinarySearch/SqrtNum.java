package BinarySearch;

public class SqrtNum {
    public static void main(String[] args) {
        int n = 36 ;
        int ans = SqrtWithBinarySearch(n);
        System.out.println(ans);
    }

    public static int SqrtWithBinarySearch(int n) {

        int start = 1 ;
        int end = n ;
        int ans = 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == n) return mid;
            else if (mid * mid > n) {
                end = mid - 1;
            } else {
                ans = mid;
                start = mid + 1;
            }
        }
        return ans;
    }
}
