package LeetCodeQuestions;

public class FirstLetterToAppearTwice {
    public static void main(String[] args) {
        String s = "abccbaacz";
        char ans = repeatedCharacter(s);
        System.out.println(ans);
    }
    static char repeatedCharacter(String s) {
        int ch [] = new int [26];
        int l = s.length();
        for(int i=0;i<l;i++){
            int index = s.charAt(i) - 'a';
            ch[index]++;
            if(ch[index] == 2){
                return s.charAt(i);
            }
        }
        return ' ';
    }
}
