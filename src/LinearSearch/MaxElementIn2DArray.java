package LinearSearch;

public class MaxElementIn2DArray {
    public static void main(String[] args) {
        int [][] arr = {
                {3,4,6,5,8},
                {12,11,14,16,17,19,10},
                {23,26},
                {34,46,56,78}
        };
        System.out.println(findMax(arr));
    }
    static int findMax(int [] [] arr){
        int max = arr[0][0];
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]>max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
