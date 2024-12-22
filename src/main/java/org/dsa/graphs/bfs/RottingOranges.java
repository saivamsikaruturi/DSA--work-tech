package org.dsa.graphs.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
    public static void main(String[] args) {


        // Sample input grid
        int[][] grid = {
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };

        // Call the method and print the result
        int result = orangesRotting(grid);
        System.out.println("Time required to rot all oranges: " + result);
    }

    private static int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        int r = grid.length;
        int c = grid[0].length;
        int fresh = 0;
        for(int i =0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==2){
                    queue.add(new int[]{i,j});
                }
                else if(grid[i][j]==1)
                {
                    fresh++;
                }
            }
        }

        int rotten = 0;
        while(!queue.isEmpty() && fresh > 0){
            int size = queue.size();
            rotten++;

            for(int i =0;i<size;i++){
                int[] current = queue.poll();
                int x = current[0];
                int y = current[1];
                if(x > 0 && grid[x-1][y] == 1) {
                    fresh--;
                   grid[x-1][y] = 2;
                   queue.add(new int[]{x-1,y});
                }
                if(y > 0 && grid[x][y-1] == 1) {
                    fresh--;
                    grid[x][y-1] = 2;
                    queue.add(new int[]{x,y-1});
                }
                if(x < r-1 && grid[x+1][y] == 1) {
                    fresh--;
                    grid[x+1][y] = 2;
                    queue.add(new int[]{x+1,y});
                }
                if(y < c-1 && grid[x][y+1] == 1) {
                    fresh--;
                    grid[x][y+1] = 2;
                    queue.add(new int[]{x,y+1});
                }

            }



        }

        return  (fresh == 0) ? rotten : -1 ;
    }

}
