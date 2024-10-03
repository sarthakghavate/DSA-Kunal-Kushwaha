package MathsForDSA.Part2;

public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(gcd(4,9));
        System.out.println(lcm(4,9));
    }
    private static int gcd(int a , int b){
        if(a == 0){
            return b;
        }
        return gcd(b%a,a);
    }
    private static int lcm(int a , int b){
        // a*b = lcm*gcd
        // lcm = a*b / gcd
        return (a*b)/gcd(a,b);
    }
}
