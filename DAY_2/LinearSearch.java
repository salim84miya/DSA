package DAY_2;

public class LinearSearch {

    public static void main(String[] args) {
        
        int[] arr = {18,12,9,14,77,50};

        System.out.println(  numberChecker(arr, 31));
      
    }

    static boolean numberChecker(int[] arr,int number){
        for(int num :arr){
            if(num==number){
                return true;
            }
        }
        return false;
    }
    
}
