package Recursion.GoogleQuestions;

import java.util.ArrayList;
import java.util.List;

public class DiceThrow {
    public static void main(String[] args) {


        // just print
        int target = 3;
//        dice("", target);
//
//        // print arraylist
//        System.out.println(diceList("", target));
//
//        // custom face dice .. eg: 7,8
//        System.out.println(diceFace("",target,8));

        // bittu's approach
        ArrayList<String> list = new ArrayList<>();
        System.out.println(diceExternalList("",target,list));
    }

    private static ArrayList<String> diceExternalList(String p, int target, ArrayList<String> list) {
        if(target == 0){
            list.add(p);
            return list;
        }

        for(int i = 1; i <= target; i++){
            list = diceExternalList(p+i,target-i,list);
        }
        return list;
    }

    private static void dice(String p , int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for(int i = 1; i <= 6 && i <= target; i++){
            dice(p+i,target - i);
        }
    }
    private static List<String> diceList(String p , int target){
        if(target == 0){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> ans = new ArrayList<>();
        for(int i = 1; i <= 6 && i <= target; i++){
            ans.addAll(diceList(p+i,target - i));
        }
        return ans;
    }
    private static List<String> diceFace(String p , int target,int face){
            if(target == 0){
                List<String> list = new ArrayList<>();
                list.add(p);
                return list;
            }
            List<String> ans = new ArrayList<>();
            for(int i = 1; i <= face && i <= target; i++){
                ans.addAll(diceFace(p+i,target - i,face));
            }
            return ans;
        }


//    private static List<List<Integer>> diceSum(List<Integer> p, int up){
//        if(up == 0){
//            List<List<Integer>> list = new ArrayList<>();
//            list.add(p);
//            return list;
//        }
//        List<List<Integer>> ans = new ArrayList<>();
//        for(int i = 1; i <= 6 && i <= up; i++){
//            List<Integer> newP = new ArrayList<>(p);
//            newP.add(i);
//            int newUp = up-1;
//            ans.addAll(diceSum(newP,newUp));
//        }
//        return ans;
//    }
}
