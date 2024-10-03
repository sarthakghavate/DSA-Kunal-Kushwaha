package Recursion.GoogleQuestions;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Modified_LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        // just print
        String digits = "34";
        letterCombinations("",digits);
        System.out.println();
        // putting answers into an arraylist
        System.out.println(letterCombinationsList("",digits));

        // print the number of possible letter combinations
        System.out.println(letterCombinationsCount("",digits));
    }
    private static void letterCombinations(String p,String up){
        // base case
        if(up.isEmpty()){
            System.out.print(p + " ");
            return;
        }

        int digit = up.charAt(0) - '0';  // this will convert '2' to 2

        for(int i = (digit - 1) * 3; i < digit * 3; i++){
            if(i == 26){
                continue;
            }
            char ch = (char) ('a' + i);
            letterCombinations(p + ch,up.substring(1));
        }
    }
    private static ArrayList<String> letterCombinationsList(String p, String up){
        // base case
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';  // this will convert '2' to 2
        ArrayList<String> ans = new ArrayList<>();

        for(int i = (digit - 1) * 3; i < digit * 3; i++){
            if(i == 26){
                continue;
            }
            char ch = (char) ('a' + i);
            ans.addAll(letterCombinationsList(p + ch,up.substring(1)));
        }
        return ans;
    }

    private static int letterCombinationsCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0';
        for (int i = (digit-1) * 3 ; i < digit * 3; i++){
            if(i == 26){
                continue;
            }
            char ch = (char) ('a' + i);
            count +=  letterCombinationsCount(p+ch , up.substring(1));
        }
        return count;
    }

}
