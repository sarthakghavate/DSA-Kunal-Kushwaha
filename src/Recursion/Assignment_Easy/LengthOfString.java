package Recursion.Assignment_Easy;

public class LengthOfString {
    public static void main(String[] args) {
        String s = "sarthak";
        System.out.println(findLength(s));
    }
    private static int findLength(String s){
        if(s.isEmpty()){
            return 0;
        }
        return findLength(s.substring(1)) + 1;
    }
//    private static int findLength(String s,int len){
//        if(s.isEmpty()){
//            return len;
//        }
//        return findLength(s.substring(1) , len+1);
//    }
}
