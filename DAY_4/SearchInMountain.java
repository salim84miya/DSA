package DAY_4;

public class SearchInMountain {
    public static void main(String[] args) {
        
        int[] arr ={0,5,3,1};
        int target =1; 

        int ans = searchTarget(arr, target);
        System.out.println(ans);

    }

    static int searchTarget(int[] arr,int target){
        int peak = searchPeak(arr);
        int firstTry = search(arr, target, 0, peak);
        int secondTry = search(arr, target, peak+1, arr.length-1);
        
        if (firstTry!=-1) {
            if(secondTry!=-1){
                return (firstTry<secondTry)?firstTry :secondTry;
            }
            return firstTry;
        }else{
            if(secondTry!=-1){
                return secondTry;
            }
        }

        return -1;
    }

    static int searchPeak(int[] arr){
        int start =0;
        int end = arr.length-1;

        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end= mid;
            }else {
                start= mid+1;
            }
        }
        return start;
    }

   static int search(int[] arr, int target,int start,int end) {

    boolean isAscending = arr[start]<arr[end];
        while(start<=end){

          int  mid = start+ (end-start)/2;

          if (target == arr[mid]) {
            return mid;
        }

        if (isAscending) {
            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        } else {
            if (target > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

    }
    return -1;
    }
}
