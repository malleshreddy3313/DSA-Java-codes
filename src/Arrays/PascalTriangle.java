package Arrays;

import java.util.ArrayList;
import java.util.List;



//Pascal triangle
public class PascalTriangle {
    public static void main(String[] args) {
        int n = 5;
       List<List<Integer>> list =  pascalTriangle(n);
        for (List<Integer> it : list) {
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

    }


    public static List<List<Integer>> pascalTriangle(int n) {
        List<List<Integer>> list = new ArrayList<>();
        for (int row = 1; row <= n; row++) {
            list.add(generateRow(row));
        }
        return list;
    }

    public static List<Integer> generateRow(int row) {
        List<Integer> list1 = new ArrayList<>();
        int ans = 1;
        list1.add(1);

        for(int col = 1 ; col < row ;col++){
            ans = ans  * (row - col);
            ans = ans / col;
            list1.add(ans);
        }
        return list1;
    }
}
