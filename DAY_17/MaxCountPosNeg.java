package DAY_17;
// https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/description/
public class MaxCountPosNeg {
    public static void main(String[] args) {
        int [] nums ={5,20,66,1314};
        System.out.println(linearSearch(nums));
    }

    static void binarySearch(int[] nums){
        int start =0;
        int end =nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]>=0){
                end=mid-1;
            }
        }
    }

    static int linearSearch(int[] nums){
        int pos=0;
        int neg=0;
        int i=0;
        while(i<nums.length){
            if(nums[i]>0){
                pos++;
            }
            if(nums[i]<0){
                neg++;
            }
            i++;
        }
        return Math.max(pos, neg);
    }
}
