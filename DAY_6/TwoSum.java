package DAY_6;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = { 12, 13, 23, 28, 43, 44, 59, 60, 61, 68, 70, 86, 88, 92, 124, 125, 136, 168, 173, 173, 180, 199,
                212, 221, 227, 230, 277, 282, 306, 314, 316, 321, 325, 328, 336, 337, 363, 365, 368, 370, 370, 371, 375,
                384, 387, 394, 400, 404, 414, 422, 422, 427, 430, 435, 457, 493, 506, 527, 531, 538, 541, 546, 568, 583,
                585, 587, 650, 652, 677, 691, 730, 737, 740, 751, 755, 764, 778, 783, 785, 789, 794, 803, 809, 815, 847,
                858, 863, 863, 874, 887, 896, 916, 920, 926, 927, 930, 933, 957, 981, 997 };
        int target = 542;

        int index1 = findIndex(arr, target);
        int index2 = binarySearch(arr, target - arr[index1], 0, arr.length - 1, index1);

        int starting_index = Math.min(index1, index2);
        int ending_index = Math.max(index1, index2);
        System.out.println(index1 + " " + index2 + " ");
    }

    static int findIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int index1 = Integer.MIN_VALUE;
        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                index1 = mid;
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return index1;
    }

    static int binarySearch(int[] arr, int target, int start, int end, int index1) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                if (mid != index1) {
                    return mid;
                }
                end = mid - 1;

            }
        }
        return -1;
    }
}
