package Arrays;

import java.util.HashMap;

public class SubArraySWithXorK {
    public static void main(String[] args) {
        int[] arr = {4,2,2,6,4};
        int n = arr.length;
        int k =6;
        int res = NoOfSubArraysWithXorK(arr,n,k);
        System.out.println(res);
    }

    public static int NoOfSubArraysWithXorK(int[] arr, int n,int k) {
        int XR = 0;
        int cnt = 0 ;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        mpp.put(XR,1);
        for(int i=0;i<n;i++){
            XR = XR^arr[i];

            int x = XR^k;
            if(mpp.containsKey(x)){
                cnt+=mpp.get(x);
            }

            if (mpp.containsKey(XR)) {
                mpp.put(XR, mpp.get(XR) + 1);
            } else {
                mpp.put(XR, 1);
            }


        }
     return cnt;
    }
}
