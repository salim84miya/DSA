package DAY_14;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int target =6;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> numbers = new HashMap<>();
        
        int start =0;
        while(start<nums.length){
            int more = target-nums[start];
            if(numbers.get(more)!=null){
                return new int[]{start,numbers.get(more)};
            }else{
                numbers.put(nums[start], start);
                start++;
            }
        }
        return new int[]{-1,-1};
    }
}
