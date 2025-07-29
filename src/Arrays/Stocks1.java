package Arrays;

public class Stocks1 {
    public static void main(String[] args) {
        int[] arr = {5,6,1,2,3,5};
        int ans = profit(arr);
        System.out.println(ans);
    }
    public static int profit(int[] arr) {
        int mini  = arr[0];
        int profit = 0;
        for (int i = 0; i < arr.length; i++) {
            int cost = arr[i] - mini;
            profit  = Math.max(profit, cost);
            mini = Math.min(mini, arr[i]);
        }
        return profit;
    }
}
