package DAY_12;

import java.util.Arrays;

// https://leetcode.com/problems/set-mismatch/description/

public class SetMismatch {
   public static void main(String[] args) {
    int[] arr = {1,2,2,4};
    System.out.println(Arrays.toString(findErrorNums(arr)));
   }
   
   public static int[] findErrorNums(int[] nums) {
        int i=0;
    while(i<nums.length){
        int correct = nums[i]-1;
        if(nums[i]!=nums[correct]){
            swap(nums,i,correct);
        }else{
            i++;
        }
    }

    int[] ans = new int[2];
    for(int j=0; j<nums.length; j++){
        if(nums[j]!=j+1){
            return new int[]{nums[j],j+1};
        }
    }
    return new int[]{-1,-1};
   }

   static void swap(int[] arr,int i,int j){
    int temp = arr[i];
    arr[i]= arr[j];
    arr[j]= temp;
   }
}