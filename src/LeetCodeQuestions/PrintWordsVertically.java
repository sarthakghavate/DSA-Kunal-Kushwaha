package LeetCodeQuestions;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/print-words-vertically/description/
/*
    Input: s = "TO BE OR NOT TO BE"
    Output: ["TBONTB","OEROOE","   T"]
    Explanation: Trailing spaces is not allowed.
    "TBONTB"
    "OEROOE"
    "   T"

TOPICS : Array,String,Simulation.
 */
public class PrintWordsVertically {
    public static void main(String[] args) {
        String s = "TO BE OR NOT TO BE";
        System.out.println(printWordsVertically(s));
    }

    private static List<String> printWordsVertically(String s){
        List<String> ans = new ArrayList<>();
        String [] words = s.split(" ");
        int maxLen = -1;
        for(String word : words){
            maxLen = Math.max(maxLen,word.length());
        }

        for (int i = 0; i < maxLen; i++){
            StringBuilder sb = new StringBuilder();
            for(String word : words){
                if(i < word.length()){
                    sb.append(word.charAt(i));
                }
                else{
                    sb.append(' ');
                }
            }

            ans.add(trimFromEnd(sb.toString()));
        }

        return ans;
    }

    private static String trimFromEnd(String s){
        int idx = -1;
        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) != ' '){
                idx = i;
                break;
            }
        }

        return s.substring(0,idx+1);
    }
}
