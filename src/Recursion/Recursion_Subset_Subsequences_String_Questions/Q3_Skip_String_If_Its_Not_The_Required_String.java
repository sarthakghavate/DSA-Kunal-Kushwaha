package Recursion.Recursion_Subset_Subsequences_String_Questions;

public class Q3_Skip_String_If_Its_Not_The_Required_String {
    public static void main(String[] args) {
        String s = "bcapplejkappabcdapp";
        System.out.println(skipAppWhenItsNotApple(s));
    }

    private static String skipAppWhenItsNotApple(String s) {
        if(s.isEmpty()){
            return "";
        }

        if(s.startsWith("app") && !s.startsWith("apple")){
            return skipAppWhenItsNotApple(s.substring(3));
        }
        else{
            return s.charAt(0) + skipAppWhenItsNotApple(s.substring(1));
        }
    }
}
