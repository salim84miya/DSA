package DAY_15;

// https://leetcode.com/problems/shuffle-string/submissions/1307336079/

public class ShufflingString {

    public static void main(String[] args) {
        String s ="abc";
        int[] indices ={0,1,2};
        System.out.println(restoreString(s, indices));
    }
    public static String restoreString(String s, int[] indices) {
        char [] c = new char[indices.length];
        for(int i=0; i<indices.length; i++){
            c[indices[i]] = s.charAt(i);
        }

        StringBuilder sb = new StringBuilder();
        for(char element:c){
            sb.append(element);
        }
        
        return sb.toString();
    }
}