package LeetCodeQuestions;
import java.util.*;
public class GroupAnagrams {
    public static void main(String[] args) {
        String [] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List <String> > ans = new ArrayList< >(groupAnagrams(strs));
        System.out.println(ans);
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        // Note:
        // After sorting each string in strs , identifying anagrams will be easy
        // because strings that are anagrams will be identical after sorting.

        // Before sorting : strs = ["eat","tea","tan","ate","nat","bat"]
        //                            |     |    ||     |     ||    |||
        // After sorting :  strs = ["aet","aet","ant","aet","ant","abt"]

        // for "aet" -> "eat","tea","ate"
        // for "ant" -> "tan","nat"
        // for "abt" -> "bat"

        // Look at the above pattern , we need a HashMap to store this , since keys are unique
        // sorted strs elements can be key and values will be words

        // What type of hashMap we need ?
        // observe the pattern above , we need String , List<String> type of HashMap

        HashMap<String,List<String> > map = new HashMap<>();

        // Now iterate through each word of strs
        for(String word : strs ){
            // convert each word to character array , for sorting its characters
            char [] chars = word.toCharArray();
            Arrays.sort(chars);
            // make sorted word from sorted character array , just pass array as input to string
            String sortedWord = new String(chars);
            // if the word is new , put that sorted word as key and create empty arrayList
            map.putIfAbsent(sortedWord,new ArrayList<>());
            // add word to that arraylist
            map.get(sortedWord).add(word);
        }
        // we have to return list of list , so we have to create a new ArrayList , which will
        // have list of map.values.
        return new ArrayList<>(map.values());
    }
}