package DAY_11;

public class ThirdMaximumNumber {
    
public static void main(String[] args) {
    int []arr ={5,2,4,1,3,6,0};
    System.out.println(thirdMax(arr));
}

        static int thirdMax(int[] nums) {
            int oldMax=0;
            int newMax=0;
            int count=0;
           for(int i=0; i<nums.length; i++){
            newMax = max(nums,i);
            if(i==0){
               oldMax = nums[newMax];
            }else if (nums[newMax]!=oldMax){
                oldMax=nums[newMax];
                count++;
            }
            if(count==2){
                return nums[newMax];
            }
            swap(nums,nums.length-i-1,newMax);
            
           }
            return nums[nums.length-1];
        }


       static void swap(int[] nums,int i,int j){
            int temp = nums[i];
            nums[i]= nums[j];
            nums[j]= temp;
        }
    

       static int max(int[] nums,int i){
            int max =0;
            for(int j=0; j<nums.length-i; j++){
                if(nums[j]>nums[max]){
                    max =j;
                }
            }
            return max;
        }
}
