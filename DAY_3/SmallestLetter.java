package DAY_3;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class SmallestLetter {
    public static void main(String[] args) {
       char[] arr = {'c','f','j'};
       char target='c';

       char ans = searchLetter(arr, target);
       System.out.println(ans);

    }

    //find the smallest number which is greater than the target
    //if the their is no number greater than the target 
    //return the first element
    static char searchLetter(char[] letters,char target){

        // if(letters.length==0){
        //     return ;
        // }else 
        if(letters.length==1){
            return letters[0];
        }

        int start = 0;
        int end = letters.length-1;
        int mid = -1;
        while(start<=end){
            mid = start+ (end-start)/2;
            if(target<letters[mid]){
                    end = mid-1;
            }else {
                start= mid+1;
            }
        }
        return letters[start%letters.length];
    }
}
