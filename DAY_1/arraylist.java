import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list.add(34);
        list.add(256);
        list.add(25689);
        list.add(25);
        list.add(2546);

        list.set(0,99);
        System.out.println(list.contains(756));

        System.out.println(list);

        Scanner sc = new Scanner(System.in);


        //input
        for(int i=0; i<5; i++){
            list2.add(sc.nextInt());
        }

        //get element at index
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i)+" ");
        }

    
    }
}
