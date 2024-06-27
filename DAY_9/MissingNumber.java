package DAY_9;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));
    }
    
    static int missingNumber(int[] nums){

        if(nums.length==1 && nums[0]!=1){
            return 1;
        }
        if(nums.length==1 && nums[0]!=0){
            return 0;
        }

        for(int i=0; i<nums.length; i++){
            
            for(int j=1; j<nums.length-i; j++){
                if(nums[j]<nums[j-1]){
                    int temp= nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1] = temp; 
                }
            }
            if(nums[nums.length-i-1]!=nums.length-i){
                return nums.length-i;
            }
            
        }
        if(nums[0]!=0){
            return 0;
        }
        return -1;
    }
}
