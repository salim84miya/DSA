package DAY_13;

import java.util.Arrays;

public class MaxProductOfThree {
    public static void main(String[] args) {
        int [] arr ={-100,-2,-3,1};
        System.out.println(maximumProduct(arr));
        System.out.println(Arrays.toString(arr));
    }

    public static int maximumProduct(int[] nums) {
        
        int len = nums.length;

        for(int i=0; i<nums.length; i++){
            int max = max(nums,i);
            swap(nums,nums.length-i-1,max);
        }
        for(int j=0; j<nums.length-2; j++){
            int ans =nums[len-1]*nums[len-2]*nums[len-3-j]; 
            if(ans>0){
                return ans; 
            }
        }
        return -1;

    }
    static int max(int[] nums,int i){
        int max =0;
        for(int j=0; j<nums.length-i; j++){
            if(Math.abs(nums[j])>Math.abs(nums[max])){
                max =j;
            }
        }
        return max;
    }

    static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
