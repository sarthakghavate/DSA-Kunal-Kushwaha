package Recursion.Recursion_Subset_Subsequences_String_Questions;

import java.util.ArrayList;

public class Q4_Subsequence {
    public static void main(String[] args) {
//        subsequence("","abc");
//        System.out.println();

        ArrayList<String> list = subsequenceAL("","abcd");
        System.out.println(list);
        System.out.println(list.size());
    }
    static void subsequence(String p, String up){
        if(up.isEmpty()){
            System.out.print(p + ",");
            return;
        }

        char ch = up.charAt(0);

        subsequence(p + ch, up.substring(1));
        subsequence(p , up.substring(1));

    }
    static ArrayList<String> subsequenceAL(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            // skipping empty strings
            if(!p.isEmpty()){
                list.add(p);
            }
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subsequenceAL(p + ch, up.substring(1));
        ArrayList<String> right = subsequenceAL(p , up.substring(1));
        left.addAll(right);
        return left;
    }
}
