package LeetCodeQuestions;

public class AddBinary {
    public static void main(String[] args) {
        String a = "100101";
        String b = "1101";
        System.out.println(addBinary(a,b));
    }
    private static String addBinary(String a , String b){
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1    ;
        int carry = 0;
        while( i >= 0 || j >= 0){ // || because we don't want to end when one string ends
            int sum = carry;
            if(i >=0){  // if i finishes first then only check j that is what i>=0
                sum += a.charAt(i) - '0';
            }
            if(j >= 0){
                sum += b.charAt(j) - '0';
            }
            sb.append(sum%2);
            carry = sum/2;
            i--;
            j--;
        }
        if(carry == 1){
            sb.append('1');
        }
        return sb.reverse().toString();
    }
}
