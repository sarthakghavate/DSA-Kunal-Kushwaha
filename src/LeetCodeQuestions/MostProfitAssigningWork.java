package LeetCodeQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class MostProfitAssigningWork {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,1);
        map.put(2,1);
        map.put(3,2);
        map.put(4,2);
        map.put(5,3);
        ArrayList<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);

        for(int i : list){
            System.out.println(i);
        }
    }

}
