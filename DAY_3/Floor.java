package DAY_3;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {2,4,7,9,14,16,18};
        int target = 10;

        int ans = floor(arr,target);
        System.out.println(ans);
    }
    //return index of target element
    //when the start has overtaken the end || when the condition of while loop is broken
    // end -> target -> start
    //means the target value has not been found 
    //but the end has become the greatest smaller number than
    //the target value so return end
    static int floor(int[] arr, int target) {

        if(arr.length==0){
            return -1;
        }else if(arr.length==1){
            return 0;
        }

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
        return end;
    }
}
