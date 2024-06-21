import java.util.*;

class arrays{
    public static void main(String args[]){
       
        //array declaration
        /*
        (compile time)
         int[]->data type 
         num_1_Arr ->reference variable
         
         (Runtime)
         new int[5] -> object
         */
        
        int[] num_1_Arr = new int[5];
        int[] num_2_Arr = {1,2,3,4,5};

        Scanner sc = new Scanner(System.in);

        //getting array as input
        System.out.println("\nEnter 5 numbers");
        for(int i=0; i<num_1_Arr.length; i++){
                num_1_Arr[i] = sc.nextInt();
        }

        //printing array using Arrays to string method
        System.out.println(Arrays.toString(num_1_Arr));

        //printing array using enhanced for loop or for each loop
        //Here instead of using the reference variable we are using actaul elements 
        for(int num :num_2_Arr){
            System.out.print(num+" ");
        }
    }

   
}