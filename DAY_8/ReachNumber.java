package DAY_8;

public class ReachNumber {
    public static void main(String[] args) {
        System.out.println(reach(2));
    }
static int reach(int target){
    int sum=0;
    int step=0;
     int tar = Math.abs(target); 
    while(sum<tar){
      step++;
      sum+=step;
    }
    while((sum-tar)%2!=0){
      step++;
      sum+=step;
    }
    return step;
  }
}
