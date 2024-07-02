package DAY_15;

public class Patterns {
    public static void main(String[] args) {
        pattern31(4);
    }

    static void pattern3(int n){
        for(int i=0; i<n; i++){
            for(int j=n; j>i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
    
    static void pattern31(int n){
        for(int row=1; row<2*n; row++){
            int totalCol = row>n?2*n-row:row;
            for(int j=1; j<=totalCol; j++){
                System.out.print(n-j+1+" ");
            }
            int spaces = row>n?2*(row-n):2*(n-row);
            for(int k=1; k<spaces; k++){
                if(row>n){
                    System.out.print((row-n+1)+" ");
                }else{
                System.out.print((n-row+1)+" ");
                }
            }
            int totalCol2 = row>n?row-n+1:n-row+1;
            for(int m=totalCol2; m<=n; m++){
                if(m==1){
                    continue;
                }
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }

    static void pattern32(int n){
        for(int i=1; i<2*n; i++){
             
        }
    }
}
