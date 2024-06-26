package DAY_9;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,3,2};
        System.out.println(find(arr));
    }
    
    static int find(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
          int mid = start+(end-start)/2;
          if(mid<end && arr[mid]>arr[mid+1] && mid>start && arr[mid]>arr[mid-1]){
              return arr[mid];
          }
          if (mid<end && arr[mid]<arr[mid+1]){
            start = mid;
          }
          if(mid>start && arr[mid]<arr[mid-1]){
            end=mid;
          }
        }
        return -1;
      }
}
