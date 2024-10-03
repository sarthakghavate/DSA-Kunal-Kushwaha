package LeetCodeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class processArrayBMC {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(5,7,3,2,6,12,15,17,24,32,37,41));
        System.out.println(processArray(array));
        System.out.println(array);
    }
    public static int processArray(ArrayList<Integer> array) {
        if(array.isEmpty()){
            return 0;
        }
        int i = 0;
        while (i < array.size()) {
            int count = 0;
            if (array.get(i) % 2 != 0) {
                int j = i;
                int max  = Integer.MIN_VALUE;
                // Continue until the sequence of even numbers ends
                while (i < array.size() && array.get(i) % 2 != 0) {
                    max = Math.max(max,array.get(i));
                    count++;
                    i++;
                }
                // Replace the sequence with the min if it's more than one number
                if(count > 1){
                    array.subList(j,i).clear();
                    array.add(j,max);
                    i = j+1;
                }
            } else {
                i++;
            }
        }
        return array.size();
    }
}
