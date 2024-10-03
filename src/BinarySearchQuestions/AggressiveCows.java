package BinarySearchQuestions;

import java.util.Arrays;

// https://leetcode.com/problems/magnetic-force-between-two-balls/description/
public class AggressiveCows {
    public static void main(String[] args) {
        int [] stalls = {5,4,3,2,1,1000000000};
        int cows = 2;
        System.out.println(maxDistanceBwAnyTwoCows(stalls,cows));
    }

    private static int maxDistanceBwAnyTwoCows(int[] stalls, int cows) {
        // WKT , min answer will be 1 and max will be max - min in stalls therefore apply binary search on answers
        Arrays.sort(stalls);
        int s = 1;
        int e = stalls[stalls.length-1];
        while(s <= e){
            int mid = s + (e-s)/2; // distance
            if(canPlaceCows(stalls,cows,mid)){
                // eliminate left half because all those are possible and we need min distance bw any two cows to be maximum.
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        return e; // polarity (striver)
    }
    private static boolean canPlaceCows(int [] stalls , int cows, int dist){
        // greedily placing first ball at first position to maximize the possible balls to be placed.
        int cowCounter = 1;
        int lastCowsPosition = stalls[0];

        // // if the distance between last ball and the position[i] is more or equal then increase counter and update last.
        for(int i = 1; i < stalls.length; i++){
            if(stalls[i] - lastCowsPosition >= dist){
                cowCounter++;
                lastCowsPosition = stalls[i];
            }

            // if we place all the cows just return true.
            if(cowCounter == cows){
                return true;
            }
        }
        return false;
    }
}
