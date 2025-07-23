package Arrays;

public class MaxNoOfOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1,1,0,0,1};
        int count =  count(arr);
        System.out.println(count);
    }

    public static int count(int[] arr) {
        int Mcount = 0;
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                Mcount =Math.max(Mcount, count);
            }else{
                count = 0;
            }
        }  return Mcount;
    }
}
