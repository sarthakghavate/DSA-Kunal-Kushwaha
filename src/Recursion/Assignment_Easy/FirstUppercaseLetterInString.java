package Recursion.Assignment_Easy;
//https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/
public class FirstUppercaseLetterInString {
    public static void main(String[] args) {
        String s = "geeksforgeeKs";
        int n = s.length();
        int index = firstUppercaseLetter(s,0);
        if(index == -1){
            System.out.println("No uppercase letter found in the given string "+s+".");
        }
        System.out.println(s.charAt(index));
    }
    private static int firstUppercaseLetter(String s,int idx){
        // string traversed completely
        if(idx == s.length()){
            return -1;
        }

        // check
        if((int) s.charAt(idx) >= 65 && (int) s.charAt(idx) <= 90){
            return idx;
        }

        return firstUppercaseLetter(s,++idx);
    }
}
