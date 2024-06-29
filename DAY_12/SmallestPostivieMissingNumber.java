package DAY_12;

// https://leetcode.com/problems/first-missing-positive/description/

import java.util.Arrays;
import java.util.*;

public class SmallestPostivieMissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        System.out.println(firstMissingPositive(arr));
    }

    public static int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]<nums.length && nums[i]>0 && nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
      
        for(int index=0; index<nums.length; index++){
            if(nums[index]!=index+1){
                return index+1;
            }
        }
        return nums.length+1;
    }

    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] = temp;
    }
}
