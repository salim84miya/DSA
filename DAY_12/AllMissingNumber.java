package DAY_12;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

import java.util.ArrayList;
public class AllMissingNumber {
    public static void main(String[] args) {
        //            0 1 2 3 4 5 6 7
        int [] arr = {4,3,2,7,8,2,3,1};
        System.out.println(arr);
        System.out.println(allMissingNumber(arr));
    }

    static ArrayList<Integer> allMissingNumber(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct =arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,correct,i);
            }else{
                i++;
            }
        }
    
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int index=0; index<arr.length; index++){
            if(arr[index]!=index+1){
                list.add(index+1);
            }
        }
        
        return list;
    } 

    static void swap(int []arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
