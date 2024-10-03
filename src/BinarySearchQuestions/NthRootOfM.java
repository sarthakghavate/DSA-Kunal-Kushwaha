package BinarySearchQuestions;

public class NthRootOfM {
    public static void main(String[] args) {
        System.out.println(NthRoot(6,4096));
    }
    public static int NthRoot(int n, int m)
    {
        // code here
        int start=1;
        int end = m;
        while(start<=end){
            int mid = start+(end-start)/2;
            int res = multiply(mid,n,m);
            if(res == 1){
                return mid;
            }
            if(res == 2){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static int multiply(int mid,int n,int m){
        // return 0 if ans==m
        // return 1 if ans < m
        // return 2 if ans >m
        long ans = 1;
        for(int i=0;i<n;i++){
            ans = ans*mid;
            if(ans > m){
                return 2;
            }
        }
        if(ans == m){
            return 1;
        }
        return 0;
    }
}
