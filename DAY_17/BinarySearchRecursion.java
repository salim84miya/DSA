package DAY_17;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int [] nums = {25,32,36,41,59,66,72};
        int target=66;
        System.out.println(bs(nums, target, 0, nums.length));
    }

    static int bs(int[] nums,int target,int start,int end){

        if(start>end){
            return -1;
        }

        int mid = start+(end-start)/2;

        if(nums[mid]==target){
            return mid;
        }

        if(nums[mid]>target){
            return bs(nums,target,start,mid-1);
        }
        return bs(nums, target, mid+1, end);
    }
}
