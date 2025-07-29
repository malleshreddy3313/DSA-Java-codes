package Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,1,1,1,3,5,1,1};
        int ans = majority(arr);
        System.out.println(ans);
    }


    //Using the Moore's Voting Algorithm
    public static int majority(int[] arr) {
        int count = 0;
        int el = 0;
        for (int i = 0; i < arr.length; i++) {
            if(count == 0) {
                count++;
                el = arr[i];
            }
            else if(el == arr[i]){
                count++;
            }else{
                count--;
            }
        }

        int count1 = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == el){
                count1++;
            }
        }
        if(count1 > arr.length/2){
            return el;
        }
        return -1;
    }
}
