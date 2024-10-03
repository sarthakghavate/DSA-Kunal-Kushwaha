package LeetCodeQuestions;
// https://leetcode.com/problems/sort-characters-by-frequency/?envType=daily-question&envId=2024-02-07
// similar question : Top K frequent elements :
// https://leetcode.com/problems/top-k-frequent-elements/description/
import java.util.*;

public class SortCharsByFrequency {
    public static void main(String[] args) {
        String s = "tree";
        String ans = frequencySort(s);
        System.out.println(ans);
    }
    private static String frequencySort(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

//        for(char ch : map.keySet()){
//            list.add(ch);
//        }


//        this can be replaced with list.addAll(map.keySet());
//
//        and this with   :   ArrayList<Character> list = new ArrayList<>(map.keySet());


        ArrayList<Character> list = new ArrayList<>(map.keySet());

        Collections.sort(list , (a,b) -> map.get(b) - map.get(a));

        System.out.println(list);

        for(char ch : list){
            for(int i = 0 ; i<map.get(ch);i++){
                sb.append(ch);
          }
        }
        return sb.toString();

    }
}
