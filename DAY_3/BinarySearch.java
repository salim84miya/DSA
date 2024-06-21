package DAY_3;

public class BinarySearch {
    public static void main(String[] args) {
        
        int[] arr = {2,4,7,9,14,16,18};
        int target = 16;

        int ans = search(arr,target);
        System.out.println(ans);
    }

    //return index of target element
    private static int search(int[] arr, int target) {

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
        return mid;
    }
    
}
