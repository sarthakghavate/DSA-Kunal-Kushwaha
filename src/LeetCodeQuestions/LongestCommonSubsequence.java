package LeetCodeQuestions;
import java.util.*;
public class LongestCommonSubsequence {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        String text1 = "ezupkr";
        String text2 = "ubmrapg";

        char [] str1 = text1.toCharArray();
        char [] str2 = text2.toCharArray();
        if(text1.length() > text2.length()){
            for(int i = 0 ; i<str1.length;i++){
                for(int j = 0; j<str2.length;j++){
                    if(str1[i] == str2[j]){
                        str1[i] = '$';
                        list.add(i);
                    }
                }
            }
        }
        else{
            for(int i = 0 ; i<str1.length;i++){
                for(int j = 0; j<str2.length;j++){
                    if(str1[i] == str2[j]){
                        str1[i] = '$';
                        list.add(i);
                    }
                }
            }
        }

        if(list.size()==0){
            System.out.println(0);
        }
        if(list.size()==1){
            System.out.println(1);
        }
        int res = uptoWhereListSorted(list);
        System.out.println("Final ans is "+res);
        System.out.println(list);
    }
    public static int uptoWhereListSorted(List<Integer>list){
        int size = list.size();
        int count = 0;
        for(int i = 1; i<size;i++){
            if(list.get(i) > list.get(i-1)){
                count++;
            }
            else{
                break;
            }
        }
        return count+1;
    }
}
