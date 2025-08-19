package Recursion;

public class PrintNto1 {
    public static void main(String[] args) {
        int n = 5;
        printN(n);
    }


    public static void printN(int n) {

        if(n == 1){
            System.out.println(n);
            return;
        }

        //for N to 1
        System.out.println(n);
        printN(n - 1);

        //for 1 to N
        System.out.println(n);
    }
}
