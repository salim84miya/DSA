package DAY_5;

public class RotataedArrayDuplicateValue {
    public static void main(String[] args) {
        int [] arr = {2,2,2,3,1};
        int target = 1;
        
        System.out.println(search(arr, target));
    }

    static boolean search(int[] arr, int target) {
     
        if(arr.length==1){
                return arr[0]==target;
          }
        int pivot = findPivot(arr);
       
       if(pivot==-1){
            //array is not rotated
            return binarySearch(arr, target, 0, arr.length-1);
       }

       if(arr[pivot]==target){
        return true;
       }

       if(arr[0]<=target){
        return binarySearch(arr, target, 0, pivot);
       }

      return binarySearch(arr, target, pivot+1, arr.length-1);
    }

    static int findPivot(int [] arr){
      
        int start =0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(mid<end &&arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                
                //check if start is pivot
                if(start<end && arr[start]>arr[start+1]){
                    return start;
                }else if(start==mid && end==mid){
                    return mid;
                }
                start++;

                //check if end is pivot
                if(end>start&& arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;

            }else if(arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]<arr[end]) ||(arr[start]==arr[mid] && arr[mid]>arr[end]) ){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return start;
    }

    static boolean binarySearch(int []arr,int target,int start,int end){


        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start= mid+1;
            }else{
                return true;
            }
        }
        return false;
    }
}
