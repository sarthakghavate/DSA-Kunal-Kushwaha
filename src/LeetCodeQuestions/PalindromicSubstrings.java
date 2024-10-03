package LeetCodeQuestions;

public class PalindromicSubstrings {
    public static void main(String[] args) {
        System.out.println((char)('t' + 10)); // t = 116
        String s = "abccbc"; //9
        System.out.println(subStrings(s));
    }
    static int subStrings(String s){
        int count =s.length();
        for(int i = 0 ; i<s.length();i++){
            for(int j = i+2; j <=s.length();j++) {
                if (isPalindrome(s.substring(i, j))) {
                    count++;
                }
            }
        }
        return count;
    }
    static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i != s.length()/2){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
