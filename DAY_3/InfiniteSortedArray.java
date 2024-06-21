package DAY_3;
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class InfiniteSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,8,10,12,14,17,19,20,21,23,27,29};
        int target = 12;

        int ans = findRange(arr, target);
        System.out.println(ans);
        
    }

    //for this problem assume you can't use 
    //arr.length as it's infinite array
    //so start creating bunchs until you find
    //the bunch where the end is bigger than target
    //then call the binary search
    static int findRange(int[] nums,int target){
        int start = 0;
        int end =2;

        while(target>end) {
            int temp = end;
             end = end +(end-start+1);
             start = temp;
        }

        return search(nums, target);

    }
    //return index of target element
   static int search(int[] arr, int target) {

        int start = 0;
        int end = arr.length-1;
        int mid = -1;
        while(start<=end){
            mid = start+ (end-start)/2;
            if(target>arr[mid]){
                start= mid+1;
            }else if(target<arr[mid]){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return mid;
    }
}