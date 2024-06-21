package DAY_3;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
       int [] arr = {5,7,7,8,8,10};
       int target=8;

       int[] ans = new int[2];

       ans[0] = search(arr, target, true);
       ans[1] = search(arr, target, false);

       System.out.println(Arrays.toString(ans));
    }

    static int search(int[] nums,int target,boolean findFirstIndex){
        
        int ans= -1;

        if(nums.length==0){
            return ans;
        }
        int start = 0;
        int end =nums.length-1;
        int mid = Integer.MIN_VALUE;
        while(start<=end){
            mid = start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }else if(target>nums[mid]){
                start= mid+1;
            }else{
                ans=mid; //potential answer
                if(findFirstIndex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        
        return ans;
    }
}
