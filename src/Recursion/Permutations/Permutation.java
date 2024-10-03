package Recursion.Permutations;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println("Permutations:");
        permutations("",str);

        System.out.println("\n\nArrayList containing Permutations: ");
        ArrayList<String> answer = permutationsList("",str);
        System.out.println(answer);

        System.out.println("\nCount of Permutations : ");
        int count = permutationsCount("",str);
        System.out.println(count);

        System.out.println("Count of Permutations by passing count in argument: ");
        System.out.println(permutationsCountInArgument("",str,0));

    }
    static void permutations(String p , String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch = up.charAt(0);
        // making variable number of function call which is dependent of value of 'p'
        for(int i = 0; i <= p.length(); i++){
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            // call recursive function
            permutations(first + ch + second,up.substring(1));
        }
    }
    static ArrayList<String> permutationsList(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        // local to this call
        ArrayList<String> ans = new ArrayList<>();
        // making variable number of function call which is dependent of value of 'p'
        for(int i = 0; i <= p.length(); i++){
            String first = p.substring(0,i);
            String second = p.substring(i);
            // call recursive function
            ans.addAll(permutationsList(first + ch + second,up.substring(1))) ;
        }
        return ans;
    }
    static int permutationsCount(String p , String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);

        // making variable number of function call which is dependent of value of 'p'
        for(int i = 0; i <= p.length(); i++){
            String first = p.substring(0,i);
            String second = p.substring(i);
            // call recursive function
           count = count + permutationsCount(first + ch + second,up.substring(1));
        }
        return count;
    }
    static int permutationsCountInArgument(String p , String up,int count){
        if(up.isEmpty()){
            // increment count , because we found a permutation
            return ++count;
        }
        char ch = up.charAt(0);

        // making variable number of function call which is dependent of value of 'p'
        for(int i = 0; i <= p.length(); i++){
            String first = p.substring(0,i);
            String second = p.substring(i);
            // call recursive function
           count =  permutationsCountInArgument(first + ch + second,up.substring(1),count);
        }
        return count;
    }
}
