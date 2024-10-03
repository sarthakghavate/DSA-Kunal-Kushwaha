package NeetCodeSolutions.ArraysandHashing;

import java.util.Arrays;
import java.util.HashMap;

// https://leetcode.com/problems/valid-anagram/description/
public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(validAnagram1(s,t));
        System.out.println(validAnagram2(s,t));
        System.out.println(validAnagram3(s,t));
    }

    // Approach 1 : Using sorting
    private static boolean validAnagram1(String s , String t){
        char [] S = s.toCharArray();
        char [] T = t.toCharArray();

        Arrays.sort(S);
        Arrays.sort(T);

        return Arrays.equals(S,T);
    }

    // Approach 2 : Using HashMap

    private static boolean validAnagram2(String s, String t){
        HashMap<Character,Integer> map = new HashMap<>();
        // count the frequency of characters in s
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        // decrement the frequency of characters in t
        for(char ch : t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)-1);
        }
        // check if any character has non-zero frequency
        for(int freq : map.values()){
            if(freq != 0){
                return false;
            }
        }
        return true;
    }

    // Approach 3 : Using HashSet (Array)
    private static boolean validAnagram3(String s , String t){
        int [] count = new int [26];
        for(char ch : s.toCharArray()){
            count[ch - 'a']++;
        }
        for(char ch : t.toCharArray()){
            count[ch - 'a']--;
        }
        for(int el : count){
            if(el != 0){
                return false;
            }
        }
        return true;

    }

}
