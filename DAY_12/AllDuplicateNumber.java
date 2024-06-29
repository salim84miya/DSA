package DAY_12;

// https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.ArrayList;
import java.util.List;

public class AllDuplicateNumber {
    public static void main(String[] args) {
        int [] arr ={4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }
    public static ArrayList<Integer> findDuplicates(int[] arr) {
     int i=0;
        while(i<arr.length){
            int correct =arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,correct,i);
            }else{
                i++;
            }
        }
    
        ArrayList<Integer> list = new ArrayList();
        
        for(int index=0; index<arr.length; index++){
            if(arr[index]!=index+1){
                list.add(arr[index]);
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
