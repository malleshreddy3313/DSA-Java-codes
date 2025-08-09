package BinarySearch;


public class CountOccurences {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,4,4,5};
        int target = 4;
        int []ans = FindFirstandLastIndex(arr,target);
        int result = ans[1]-ans[0]+1;
        System.out.println(result);
    }

    public static int[] FindFirstandLastIndex(int[] arr, int target) {
        int first = findFirst(arr,target);
        int second = findSecond(arr,target);
        return new int[]{first,second};
    }

    private static int findSecond(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int last = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                last = mid;
                left = mid + 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return last;
    }

    private static int findFirst(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int first = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                first = mid;
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return first;
    }


}
