import java.util.Arrays;
import java.util.Scanner;

public class mutlidimensions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
         declaration
         int[][]-> data type
         arr -> reference var

         new int[3][]->object

         row size is mandatory but col size is not
         */
        int[][] arr = new int[3][];

        int [][] arr2 = {{1,2,3},
                         {4,5,6},
                         {7,8,9}};

        int [][] arr3 = {{1,2,3},
                         {4,5,},
                         {6,7,8,9}};

        int [][] arr4 = new int[3][3];

        //input
        for(int i=0; i<arr4.length; i++){
            for(int j=0; j<arr4[i].length; j++){

                arr4[i][j] = sc.nextInt();
            }
        }

        //output
        
        //Method 1
        for(int i=0; i<arr4.length; i++){
            for(int j=0; j<arr4[i].length; j++){

                System.out.print(arr4[i][j]+" ");
            }
            System.out.println();
        }

        //Method 2
        for(int i=0; i<arr4.length; i++){
                System.out.println(Arrays.toString(arr4[i])); 
        }

        //Method 3
        for(int[] num :arr4){
            System.out.println(Arrays.toString(num));
        }

    }
}
