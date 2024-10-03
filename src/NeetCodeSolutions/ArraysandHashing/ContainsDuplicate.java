package NeetCodeSolutions.ArraysandHashing;

import java.util.HashSet;

// https://leetcode.com/problems/contains-duplicate/description/

public class ContainsDuplicate {
    public static void main(String[] args) {
        int [] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
    private static boolean containsDuplicate(int [] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(!set.add(num)){         // set.add returns false if number is already there in the set
                return true;
            }
        }
        return false;
    }

}
