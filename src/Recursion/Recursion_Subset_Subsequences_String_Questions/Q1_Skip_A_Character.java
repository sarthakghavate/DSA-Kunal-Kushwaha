package Recursion.Recursion_Subset_Subsequences_String_Questions;

public class Q1_Skip_A_Character {
    public static void main(String[] args) {
        String str = "sarthak";

        StringBuilder sb = new StringBuilder("");
        System.out.println(skip(str,0,sb));

        skip1("",str);

        System.out.println(skip2(str));
    }

    // method 1 : passing answer string in the argument itself
    private static String skip(String str , int idx , StringBuilder sb){
        // base case
        if(idx >= str.length()){
            return sb.toString();
        }

        if(str.charAt(idx) != 'a'){
            sb.append(str.charAt(idx));
        }

        return skip(str,idx+1,sb);
    }

    // method 1 of kunal
    private static void skip1(String p ,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skip1(p, up.substring(1));
        }
        else{
            skip1(p + ch, up.substring(1));
        }
    }

    // method 2 : create the answer variable in the function body
    private static String skip2(String s){
        if(s.isEmpty()){
            return "";
        }

        char ch = s.charAt(0);

        if(ch == 'a'){
            return skip2(s.substring(1));
        }
        else{
            return ch + skip2(s.substring(1));
        }
    }

}
