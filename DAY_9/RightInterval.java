package DAY_9;

import java.util.Arrays;

public class RightInterval {
    public static void main(String[] args) {
        
        int [][] arr2 = {{1,2}};

        // int [][] arr = {{3,4},
        //                 {2,3},
        //                 {1,2}};

        // int [][] arr3 ={{1,4},{2,3},{3,4}};

        // int [][]arr4 = {{4,5},{2,3},{1,2}};
        System.out.println(Arrays.toString(findRightInterval(arr2)));
    }

    static int[] findRightInterval(int[][] matrix){
   
        int rStart =0;
       int rEnd = matrix.length-1;

        int[] ans = new int[rEnd+1]; 

       boolean isAscending = matrix[rStart][0]<matrix[rEnd][0];

       for(int i=0; i<=rEnd; i++){
        ans[i] = binarySearch(matrix, matrix[i][1], rStart, rEnd,isAscending);
       }
       return ans;
    }

    static int binarySearch(int[][] matrix ,int target,int start,int end,boolean isAscending){

        int ans=-1;
        while(start<=end){
            int  mid = start+(end-start)/2;
          if(matrix[mid][0]==target){
            return mid;
          }else if(matrix[mid][0]<target){
            if(isAscending){
                start=mid+1;
            }else{
                end=mid-1;
            }
          }else{
            ans = mid;
            if(isAscending){
                end=mid-1;
            }else{
                start=mid+1;
            }
          }  
        }
        return ans;

    }
    
}
