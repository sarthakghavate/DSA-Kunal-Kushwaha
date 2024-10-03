package Recursion.GoogleQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");

        String digits = "9763";
        System.out.println(letterCombinations("",digits,map));
    }
    public static List<String> letterCombinations(String p, String up ,HashMap<Integer,String> map) {
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        // this will contain local answer of that function call
        List<String> ans = new ArrayList<>();
        String str = map.get(digit);
        for(int i = 0; i < str.length(); i++){
            ans.addAll(letterCombinations(p+str.charAt(i),up.substring(1),map));
        }
        return ans;
    }
}
