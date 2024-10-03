package MathsForDSA;

public class NthMagicNumber {
    public static void main(String[] args) {
        int n = 6;
        int ans = findMagicBitManipulation(n);
        System.out.println(ans);
        // 5 -> bin = 1 0 1   5^3 + 5^1
    }
    private static int findMagicBitManipulation(int n){
        int ans = 0;
        int base = 5;
        while(n > 0){
            int last = n & 1; // this will give last digit
            n = n >> 1;    // remove that last digit
            ans += last*base;
            base = base*5;  // incrementing base for 5,5^2,5^3,5^4....
        }
        return ans;
    }
    private static int findMagicNo(int n){
        String b = Integer.toBinaryString(n);
        int l = b.length();
        int ans = 0;
        for(int i = 0 ; i < l ; i++){
            if(b.charAt(i) == '1'){
                ans += (int)Math.pow(5,l-i);
            }
        }
        return ans;
    }
}
