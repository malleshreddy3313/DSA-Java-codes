package Arrays;


//finding the missing number form the array
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={1,2,4,5};
        int n = 5;
        int ans = missing2(arr,n);
        System.out.println(ans);
    }


    //optimal approach Time-complexity - O(2N) && space-complexity - O(N)
    public static int missing(int[] arr,int n) {
        int[] hash = new int[n + 1];

        for(int i=0;i<n-1;i++){
            hash[arr[i]]++;
        }
        for(int i=1;i<=n;i++){
            if(hash[i]!= 1){
                return i;
            }
        }
        return -1;
    }

    //XOR Approach
    //optimal approach - Time complexity - O(N) && Space-complexity -O(1)
    static int missing2(int[] arr,int n){
        int xor1 = 0 ;
        int xor2 = 0 ;
        for(int i=0;i<arr.length;i++){
            xor1 = xor1^arr[i];
            xor2 = xor2^(i+1);
        }
        xor2 = xor2^n;
        return xor1^xor2;
    }

}
