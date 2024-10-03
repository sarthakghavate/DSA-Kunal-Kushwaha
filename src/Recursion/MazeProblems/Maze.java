package Recursion.MazeProblems;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(mazeSolutionCount(3,3));
//        mazeSolutionPaths("",3,3);
//        System.out.println();
//        mazeSolutionPathsKunal("",3,3);
//        System.out.println(mazeSolutionPathsList("",3,3));
        System.out.println(mazeSolutionPathsDiagonalList("",3,3));
    }
    private static int mazeSolutionCount(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }
        int left = mazeSolutionCount(r-1,c);
        int right = mazeSolutionCount(r,c-1);
        return left + right;
    }
//    private static void mazeSolutionPaths(String path , int r, int c){
//        if(r == 1 && c > 1){
//            StringBuilder pathBuilder = new StringBuilder(path);
//            for(int i = 0; i < c-1; i++){
//                pathBuilder.append("R");
//            }
//            System.out.println(pathBuilder);
//            return;
//        }
//        if(c == 1 && r > 1){
//            StringBuilder pathBuilder = new StringBuilder(path);
//            for(int i = 0; i < r-1; i++){
//                pathBuilder.append("D");
//            }
//            System.out.println(pathBuilder);
//            return;
//        }
//
//        mazeSolutionPaths(path + "L" , r-1, c);
//        mazeSolutionPaths(path + "D" , r, c-1);
//    }
    private static void mazeSolutionPathsKunal(String path , int r, int c){
        if(r == 1 && c == 1){
            System.out.println(path);
            return;
        }
        if(r > 1){
            mazeSolutionPathsKunal(path + "L" , r-1, c);
        }
        if(c > 1){
            mazeSolutionPathsKunal(path + "D" , r, c-1);
        }
    }
    private static ArrayList<String> mazeSolutionPathsList(String path , int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r > 1){
            ans.addAll(mazeSolutionPathsList(path + "L" , r-1, c));
        }
        if(c > 1){
            ans.addAll(mazeSolutionPathsList(path + "D" , r, c-1));
        }
        return ans;
    }
private static ArrayList<String> mazeSolutionPathsDiagonalList(String path , int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r > 1){
            ans.addAll(mazeSolutionPathsDiagonalList(path + "H" , r-1, c));
        }
        if(c > 1){
            ans.addAll(mazeSolutionPathsDiagonalList(path + "V" , r, c-1));
        }
        if(r > 1 &&  c > 1) {
            ans.addAll(mazeSolutionPathsDiagonalList(path + "D", r - 1, c - 1));
        }
        return ans;
    }
    private static void mazeWithObstacles(String path, int r, int c){

    }
}
