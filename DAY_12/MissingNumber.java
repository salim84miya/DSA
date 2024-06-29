package DAY_12;
// https://leetcode.com/problems/missing-number/description/

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        
        System.out.println(missingNumber(arr));
    }
    
    static int missingNumber(int[] arr){
        int i=0;
        while(i<arr.length){
             if(arr[i]<arr.length && arr[i]!=arr[arr[i]]){
                swap(arr,arr[i], i);
            }else{
                i++;
            }
        }

         i=0;
        while(i<arr.length){
            if(arr[i]!=i){
                return i;
            }
            i++;
        }
        return arr.length;
    }

    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] =arr[j];
        arr[j] = temp;
    }
}
