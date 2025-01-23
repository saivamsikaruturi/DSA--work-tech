package org.dsa.graphs.UnionFind;

public class NumberOfProvinces {

    public static int findCircleNum(int[][] isConnected) {

        int[] visited = new int[isConnected.length];
        int count = 0;
        for(int i = 0;i<isConnected.length;i++){
            if(visited[i]!=1){
                dfs(isConnected,visited,i);
                count++;
            }
        }

        return count;

    }

    private static void dfs(int[][] isConnected, int[] visited, int i) {

          visited[i] = 1;
          for(int j = 0;j<isConnected.length;j++){
              if(isConnected[i][j]==1 && visited[j]==0){
                  dfs(isConnected,visited,j);
              }
          }

    }

    public static void main(String[] args) {
        System.out.println(findCircleNum(new int[][]{{1,1,0},{1,1,0},{0,0,1}}));
    }
}
