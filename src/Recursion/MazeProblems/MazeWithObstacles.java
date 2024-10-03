package Recursion.MazeProblems;

public class MazeWithObstacles {
    public static void main(String[] args) {
        // false means rives which you can not cross.
        boolean [][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true},
        };

        mazeSolutionWithObstacles(maze,"",0,0);
    }
    private static void mazeSolutionWithObstacles(boolean [] [] maze, String path, int r, int c){

        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.print(path+" ");
            return;
        }
        // obstacle !! found so return (pauses recursion for that call)
        if(!maze[r][c]){
            return;
        }
        if(r < maze.length-1){
            mazeSolutionWithObstacles(maze,path+"D",r+1,c);
        }
        if(c < maze[0].length-1){
            mazeSolutionWithObstacles(maze,path+"R",r,c+1);
        }
    }
}
