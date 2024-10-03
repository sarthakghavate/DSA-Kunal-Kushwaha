package MathsForDSA.Part2;

public class BinarySearchSQRT {
    public static void main(String[] args) {
        int n = 40;
        int precision = 3;
        System.out.printf("%.3f" ,findSQRT(n,precision));

    }


    // TC : O(log(n ))
    private static double findSQRT(int n,int p){
        int start = 0;
        int end = n;
        double root = 0.0;
        while(start <= end){
            int mid = start  + (end - start)/2;
            if(mid * mid == n){
                return mid;
            }
            if(mid * mid > n){
                end = mid -1;
            }
            else{
                start = mid+1;
            }
        }
        // update root
        root = end;


        // for precision
        double increment = 0.1;
        for(int i = 0 ; i < p ; i++){
            while (root * root <= n){
                root += increment;
            }
            // go back one step
            root -= increment;
            increment /= 10;  // 0.1  -> 0.01
        }

        return root;
    }
}
