package Recursion;

public class ReverseDigits {

    static int sum = 0 ;
    static void reverse(int num) {
        if (num == 0) {
            return;
        }
        int rem = num % 10;
        sum = sum * 10 + rem;
        reverse(num / 10);
    }

    public static void main(String[] args) {
     int num = 1824;
     reverse(num);
     System.out.println(sum);
    }
}
