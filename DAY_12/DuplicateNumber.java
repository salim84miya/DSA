package DAY_12;
// https://leetcode.com/problems/find-the-duplicate-number/description/
public class DuplicateNumber {
    public static void main(String[] args) {
        int arr[] ={1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
    public static int findDuplicate(int[] arr) {
        int i=0;
       while(i<arr.length){
           int correct =arr[i]-1;
           if(arr[i]!=arr[correct]){
               swap(arr,correct,i);
           }else{
               i++;
           }
       }
   
       // ArrayList<Integer> list = new ArrayList();
       
       for(int index=0; index<arr.length; index++){
           if(arr[index]!=index+1){
               return arr[index];
           }
       }
       
       return -1;
   } 

    static void swap(int []arr,int i,int j){
       int temp = arr[i];
       arr[i] = arr[j];
       arr[j] = temp;
   }
}
