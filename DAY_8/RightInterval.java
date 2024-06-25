package DAY_8;

import java.util.Arrays;

public class RightInterval {
    public static void main(String[] args) {
        
        int [][] arr = {{3,4},
                        {2,3},
                        {1,2}};
        System.out.println(Arrays.toString(findRightInterval(arr)));
    }

    static int[] findRightInterval(int[][] matrix){
        int rstart =0;
        int rEnd = matrix.length-1;
        int cEnd = matrix[0].length;

        if(matrix.length==1){
            return new int[]{-1};
        }

        boolean isAscending = matrix[rstart][0]<matrix[rEnd][0];

        int [] ans = new int[matrix.length];

        for(int i=0; i<matrix.length; i++){
            while(rstart<rEnd){
                int mid = rstart+(rEnd-rstart)/2;
                if(matrix[mid][0]==matrix[i][1]){
                    ans[i] = mid;
                    break;
                }else if(matrix[mid][0]>matrix[i][1]){
                    ans[i]=mid;
                    if(isAscending){
                        if(mid>rstart){
                            rEnd = mid-1;
                        }
                    }else{
                        if(mid<rEnd)
                        rstart = mid+1;
                    }
                }else {
                    if(isAscending){
                        if(mid<rEnd){
                            rstart=mid+1;
                        }
                    }else{
                        if(mid>rstart){
                            rEnd = mid-1;
                        }
                    }
                    
                }
                ans[i]=-1;
            }
   
        }
        return ans;
    }
    
}
