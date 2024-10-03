package Recursion.Assignment_Easy;
import java.util.Scanner;
public class Geek_o_nacci_number {
    public static void main (String[] args) {
        //code
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while(tests > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(geekonacci(a,b,c,n));
            tests--;
        }
    }

    private static int geekonacci(int a, int b, int c, int n) {
        if(n == 1){
            return a;
        }
        if(n == 2){
            return b;
        }
        if(n == 3){
            return c;
        }
        return geekonacci(a,b,c,n-3) + geekonacci(a,b,c,n-2) + geekonacci(a,b,c,n-1);
    }
}
