package Recursion.MazeProblems;

import java.util.Arrays;

public class MazeAllPaths {
    public static void main(String[] args) {
        boolean [] [] maze = {{true,true,true},{true,true,true},{true,true,true}};
        mazeSolutionAllPaths(maze,"",0,0);

        int [] [] path = new int[maze.length][maze[0].length];
        mazeSolutionAllPathsPrint(maze,"",0,0,path,1);
    }
    private static void mazeSolutionAllPaths(boolean [] [] maze ,String path ,int r , int c){
        // base case
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(path);
        }

        if(!maze[r][c]){
            return;
        }
        // I am considering this block in my path so set is as false
        maze[r][c] = false;

        if(r < maze.length-1){
            mazeSolutionAllPaths(maze,path+"D",r+1,c);
        }
        if(c < maze[0].length-1){
            mazeSolutionAllPaths(maze,path+"R",r,c+1);
        }if(r > 0){
            mazeSolutionAllPaths(maze,path+"U",r-1,c);
        }
        if(c > 0){
            mazeSolutionAllPaths(maze,path+"L",r,c-1);
        }

        /*
            this line is where the function will be over
            so before the function gets removed also remove the changes that were made by that function.
         */

        maze[r][c] = true;

    }
    private static void mazeSolutionAllPathsPrint(boolean [] [] maze ,String p ,int r , int c,int [][] path, int step){
        // base case
        if(r == maze.length-1 && c == maze[0].length-1){

            path[r][c] = step;

            for(int [] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[r][c]){
            return;
        }
        // I am considering this block in my path so set is as false
        maze[r][c] = false;
        path[r][c] = step;

        if(r < maze.length-1){
            mazeSolutionAllPathsPrint(maze,p+"D",r+1,c,path,step+1);
        }
        if(c < maze[0].length-1){
            mazeSolutionAllPathsPrint(maze,p+"R",r,c+1,path,step+1);
        }if(r > 0){
            mazeSolutionAllPathsPrint(maze,p+"U",r-1,c,path,step+1);
        }
        if(c > 0){
            mazeSolutionAllPathsPrint(maze,p+"L",r,c-1,path,step+1);
        }

        /*
            this line is where the function will be over
            so before the function gets removed also remove the changes that were made by that function.
         */

        maze[r][c] = true;
        path[r][c] = 0;
    }
}
