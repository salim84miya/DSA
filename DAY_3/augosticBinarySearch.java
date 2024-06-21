package DAY_3;

public class augosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 7, 9, 14, 16, 18 };
        int[] arr2 = { 21, 19, 15, 13, 8, 4, 2, 0 };
        int target = 13;

        int ans = search(arr2, target);
        System.out.println(ans);
    }

    // return index of target element
    private static int search(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        } else if (arr.length == 1) {
            return 0;
        }

        boolean isAscending = arr[arr.length - 1] > arr[0];

        int start = 0;
        int end = arr.length - 1;
    
        while (start <= end) {
           int  mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (isAscending) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
