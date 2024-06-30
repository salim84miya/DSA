package DAY_10;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,1,5,3,2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        
        for(int i=0; i<arr.length; i++){
            int max =max(arr,i);      
            swap(arr, arr.length-i-1, max);
        }
    }

    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int max(int[] arr,int j){
        int max =0;

        for(int i=0; i<arr.length-j; i++){
            if(arr[i]>arr[max]){
                max =i;
            }
        }
        return max;
    }

}
