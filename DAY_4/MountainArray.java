package DAY_4;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {0,1,0};

        int ans = searchPeak(arr);
        System.out.println(ans);
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
}
