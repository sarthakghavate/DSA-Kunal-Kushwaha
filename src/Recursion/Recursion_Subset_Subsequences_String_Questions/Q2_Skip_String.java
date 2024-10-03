package Recursion.Recursion_Subset_Subsequences_String_Questions;

public class Q2_Skip_String {
    public static void main(String[] args) {
        String s = "bcdapplea";
        System.out.println(skipApple(s));
    }
    private static String skipApple(String s){
        if(s.isEmpty()){
            return "";
        }

        if(s.startsWith("apple")){
            return skipApple(s.substring(5));
        }
        else{
            return s.charAt(0) + skipApple(s.substring(1));
        }
    }
}
