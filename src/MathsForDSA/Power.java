package MathsForDSA;
// find base ^ power
// eg : 3 ^ 6    // ans = 729
// 3^6 = 3^2+4 = 3^2 * 3^4
// 6 = 1 1 0

public class Power {
    public static void main(String[] args) {
        int base = 4;
        int power = 8;
        System.out.println(calculatePower(base,power));
    }
    private static int calculatePower(int base , int power){
        int ans = 1;
        // base = 3 ; power = 6 -> 1 1 0
        while(power > 0){
            if((power & 1) == 1){
                ans = ans * base;
            }
            base = base * base;  // increment base 3 -> 3*3 = 9 -> 9*9 = 81
            power = power >> 1;
        }
        return ans;
    }
}
