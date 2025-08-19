package Recursion;


public class SumDigits {
    public static void main(String[] args) {
        int n = 1642;
        int sum = sumDigits(n);
        System.out.println(sum);
    }

    public static int sumDigits(int n) {
        if(n <= 0){
            return 0;
        }
        return sumDigits(n/10)+ (n % 10);
    }

}
