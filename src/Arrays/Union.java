package Arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class Union {
    public static void main(String args[]) {
        int n = 10, m = 7;
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        ArrayList<Integer> Union2 = union2(arr1, arr2, n, m);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val : Union2) {
            System.out.print(val + " ");
        }
    }


    // brute force approach - Time complexity - O( (m+n)log(m+n) )

    static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
        HashSet<Integer> s = new HashSet<>();
        ArrayList<Integer> Union = new ArrayList<>();
        for (int i = 0; i < n; i++)
            s.add(arr1[i]);
        for (int i = 0; i < m; i++)
            s.add(arr2[i]);
        for (int it : s)
            Union.add(it);
        return Union;
    }


    //optimal approach Time-Compleexxity-O(n+m)


    static ArrayList<Integer> union2(int[] arr1, int[] arr2, int n, int m) {
        ArrayList<Integer> Union = new ArrayList<>();
        int i = 0, j = 0;

        while (i < n && j < m) {
            // Case 1: arr1[i] is smaller
            if (arr1[i] <= arr2[j]) {
                // Add arr1[i] if Union is empty or it's different from the last element added
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i]) {
                    Union.add(arr1[i]);
                }
                i++; // Always move pointer for arr1
            }
            // Case 2: arr2[j] is smaller
            else { // arr1[i] > arr2[j]
                // Add arr2[j] if Union is empty or it's different from the last element added
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j]) {
                    Union.add(arr2[j]);
                }
                j++; // Always move pointer for arr2
            }
        }

        // Add remaining elements from arr1 (if any)
        while (i < n) {
            if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i]) {
                Union.add(arr1[i]);
            }
            i++;
        }

        // Add remaining elements from arr2 (if any)
        while (j < m) {
            if (Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j]) {
                Union.add(arr2[j]);
            }
            j++;
        }

        return Union;
    }
}


