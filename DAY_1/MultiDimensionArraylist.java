import java.util.Scanner;
import java.util.ArrayList;

public class MultiDimensionArraylist {
    public static void main(String[] args) {
        
    
    //declaration
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    //initialization
    for(int i=0; i<3; i++){
        list.add(new ArrayList<>());
    }

    Scanner sc = new Scanner(System.in);

    //adding elements
    for(int i=0; i<3; i++){
        for (int j=0; j<3; j++){

            list.get(i).add(sc.nextInt());
        }
    }

    System.out.println(list);
    }
}
