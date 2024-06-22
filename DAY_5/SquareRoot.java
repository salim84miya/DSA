package DAY_5;

public class SquareRoot {
    public static void main(String[] args) {
        int target = 2147395598;

        System.out.println(findSquareRoot(target));
    }

    static int findSquareRoot(int target){
        
        if(target==0||target==1){
            return target;
        }

        long start = 1;
        long end=target-1;

        while (start<=end) {
            long mid = start+(end-start)/2;

           
            if(mid*mid==target){
                return (int) mid;
            }

            if(mid*mid<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return (int)start-1;
    }
}
