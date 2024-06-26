package DAY_9;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,3,2};
        System.out.println(find(arr));
    }
    
    static int find(int[] arr){

      if(arr.length==1){
        return 0;
      }

      if(arr[0]>arr[1]){
        return 0;
      }

      if(arr[arr.length-1]>arr[arr.length-2]){
        return arr.length-1;
      }
        int start = 1;
        int end = arr.length-2;
        while(start<=end){
          int mid = start+(end-start)/2;
          if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
              return mid;
          }else if (arr[mid]<arr[mid+1]){
            start = mid+1;
          }else if( arr[mid]<arr[mid-1]){
            end=mid-1;
          }else{
            start=mid+1;
          }
        }
        return -1;
      }
}
