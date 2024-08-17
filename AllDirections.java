public class AllDirections {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}};
        AllDir("",maze,0,0);
    }
    static void AllDir(String p, boolean[][] maze, int r, int c){
        if (r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if (!maze[r][c]){
            return;
        }
        //mark the visited block as false so it wont be visited again
        maze[r][c] = false;

        if (r < maze.length-1){
            AllDir(p+'D',maze,r+1,c);
        }
        if (c < maze.length-1){
            AllDir(p+'H',maze,r,c+1);
        }
        if (c > 0){
            AllDir(p+'L',maze,r,c-1);
        }
        if (r > 0){
            AllDir(p+'U',maze,r-1,c);
        }
        // now this is the final line of the code
        // so revert all the previous changes in the blocks(reset to default)
        maze[r][c] = true;
    }
}
