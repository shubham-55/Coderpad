package gs.coderpad.practice;

public class AvidRockCollector {
    public static void main(String[] args) {
        int[][] grid = {
                {0, 0, 0, 0, 5},  // New York (finish)
                {0, 1, 1, 1, 0},  // Intermediate cities
                {2, 0, 0, 0, 0}   // So Cal (start)
        };
        int maxRocks = collectMaxRocks(grid);
        System.out.println("Maximum rocks collected: " + maxRocks);
    }
    public static int collectMaxRocks(int[][] grid){
        int rows= grid.length;
        int cols=grid[0].length;
        int[][] dp=new int[rows][cols];
        dp[rows-1][0]=grid[rows-1][0];
        for(int i=rows-2;i>=0;i--){ //South to north
            dp[i][0]=dp[i+1][0]+grid[i][0];
        }
        for(int i=1;i<cols;i++){//West to east
            dp[0][i]=dp[0][i-1]+grid[0][i];
        }
        for(int i=rows-2;i>=0;i--){
            for(int j=1;j<cols;j++){
                dp[i][j]=grid[i][j]+Math.max(dp[i+1][j],dp[i][j-1]);
            }
        }
        return dp[0][cols-1];
    }
}
