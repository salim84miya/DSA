package DAY_7;

import java.util.Arrays;

public class MatrixBinarySearch {
    public static void main(String[] args) {
        
        //traversing and searching in an strictly sorted matrix or 2-D Array
        int matrix[][] = {
                        {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
         int target = 21;
         
         System.out.println(Arrays.toString(search(matrix, target)));
         
    }

    static int[] search(int [][] matrix,int target){
        int rStart = 0;
        int rEnd = matrix.length-1;
        int cStart = 0;
        int cEnd = matrix[0].length-1;

    

        int cMid = cStart+(cEnd-cStart)/2;
        while(rStart<(rEnd-1)){

            int rMid = rStart +(rEnd-rStart)/2; 
            
            if(matrix[rMid][cMid]>target){
                rEnd=rMid;
            }else if(matrix[rMid][cMid]<target){
                rStart=rMid;
            }else{
                return new int[]{rMid,cMid};
            }

        }
        
        //four cases
        //top left part
        if(matrix[rStart][cMid]>=target){
           return binarySearch(matrix, target, 0, cMid, rStart);
        }
        //top right part
        if(matrix[rStart][cMid]<=target && target<matrix[rStart][cEnd]){
            return binarySearch(matrix, target, cMid, cEnd, rStart);
        }
        //bottom left part
        if(matrix[rEnd][cMid]>=target){
            return binarySearch(matrix, target, 0, cMid, rEnd);
        }
        //bottom right part
        if(matrix[rEnd][cMid]<=target && target<matrix[rEnd][cEnd]){
            return binarySearch(matrix, target, cMid, cEnd, rEnd);
        }

        return new int[]{-1,-1};
    }

    static int[] binarySearch(int[][] arr ,int target,int start,int end,int row){
        
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[row][mid]>target){
                end=mid-1;
            }else if(arr[row][mid]<target){
                start=mid+1;
            }else{
                return new int []{row,mid};
            }
        }
        return new int []{-1,-1};
    }
}
