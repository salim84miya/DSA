package DAY_4;

public class SearchInMountainLeetcode {
    public static void main(String[] args) {
        
    }
    static int searchTarget(MountainArray mountainArr,int target){
        int peak = searchPeak(mountainArr);
        int firstTry = search(mountainArr, target, 0, peak);
        int secondTry = search(mountainArr, target, peak+1, mountainArr.length()-1);
        
        if (firstTry!=-1) {
            if(secondTry!=-1){
                return (firstTry<secondTry)?firstTry :secondTry;
            }
            return firstTry;
        }else{
            if(secondTry!=-1){
                return secondTry;
            }
        }

        return -1;
    }

    static int searchPeak(MountainArray mountainArr){
        int start =0;
        int end = mountainArr.length()-1;

        while(start<end){
            int mid = start+(end-start)/2;
            if(mountainArr.get(mid)>mountainArr.get(mid+1)){
                end= mid;
            }else {
                start= mid+1;
            }
        }
        return start;
    }

   static int search(MountainArray mountainArr, int target,int start,int end) {

    boolean isAcending= mountainArr.get(start)<mountainArr.get(end);

        while(start<=end){
          int  mid = start+ (end-start)/2;

        if(target==mountainArr.get(mid)){
            return mid;
        }

          if(isAcending){
            if(target>mountainArr.get(mid)){
                start= mid+1;
            }else {
                end=mid-1;
            }
          }
           else{
                if(target>mountainArr.get(mid)){
                    end=mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
       return -1; 
    }
}
