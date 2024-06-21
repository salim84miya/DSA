package DAY_3;

public class ceilingumber {
    public static void main(String[] args) {

        // finding the smallest number in series which is greater than or equal to the
        // target value

        int[] arr = new int[] { 2,3,5,9,14,16,18 };
        int target = 15;

        System.out.println(findCeiling(arr, target));
    }

    static int findCeiling(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        } else if (arr.length == 1) {
            return arr[0];
        }

        int start = 0;
        int end = arr.length - 1;
        int mid = Integer.MIN_VALUE;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                if (arr[mid - 1] == target) {
                    return mid - 1;
                } else if (arr[mid - 1] > target) {
                    end = mid + 1;
                } else {
                    return mid;
                }
            } else {
                return mid;
            }
        }

        return mid;

    }
}
