package Recursion.Assignment_Easy;

public class SpecialFibo {
    public static void main(String[] args) {
        int a = 92;
        int b = 49;
        int n = 21;
        System.out.println(specialFibo(a,b,n));
    }

    private static int specialFibo(int a, int b, int n) {
        if(n == 0){
            return a;
        }
        if(n == 1){
            return b;
        }
        return specialFibo(a,b,n-1) ^ specialFibo(a,b,n-2);
    }
}
