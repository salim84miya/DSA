package DAY_5;

public class RotatedArray {

    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};
        int target =0;

        int ans = search(arr, target);
        System.out.println(ans);
    }
    static int search(int[] nums, int target) {
        
        int pivot = searchPivot(nums);

        if(pivot==-1){
            //array is not rotated
          return  binarySearch(nums, target, 0, nums.length-1);
        }

        if(target==nums[pivot]){
            return pivot;
        }

        if(nums[0]<=target){
            return    binarySearch(nums, target, 0, pivot);
        }

        return binarySearch(nums, target, pivot+1, nums.length-1);
    }

    static int searchPivot(int[] arr ){

        int start =0;
        int end = arr.length-1;

        while(start<=end){
            
            int mid = start+(end-start)/2;


            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }

            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }

            if(arr[start]>=arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }

        }
        return -1;
    }

    static int binarySearch(int[] arr,int target,int start,int end){
        
        while(start<=end){
            int mid = start+(end-start)/2;

            if(target<arr[mid]){
                end= mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}