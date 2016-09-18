/**
 * 
 */
package com.fursa.graph;

/**
 * @author Swetha
 *
 */
public class NumberOfIslands {

	static int[] rowBr = {-1,-1,-1,0,0,1,1,1};
	static int[] colBr = {-1,0,1,-1,1,-1,0,1};


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int M[][]=  new int[][] {{1, 1, 0, 0, 0},
				{0, 1, 0, 0, 1},
				{1, 0, 0, 1, 1},
				{0, 0, 0, 0, 0},
				{1, 0, 1, 0, 1}
		};
		System.out.println("Number of islands is: "+ countIslands(M));
	}

	private static int countIslands(int[][] m) {
		int count =0;
		boolean visited[][] = new boolean[m.length][m[0].length];

		for(int i =0;i<m.length;i++){
			for(int j=0;j<m[0].length;j++){
				if(m[i][j] ==1 && !visited[i][j]){
					DFS(m,visited,i,j);
					count++;
				}
			}

		}
		return count;
	}

	private static void DFS(int[][] m, boolean[][] visited, int i, int j) {
		visited[i][j] = true;
		for(int k=0;k<8;k++){
			if(isSafe(m,visited,i+rowBr[k],j+colBr[k]))
				DFS(m,visited,i+rowBr[k],j+colBr[k]);
		}
	}

	private static boolean isSafe(int[][] m, boolean[][] visited, int i, int j) {
		if((i>=0) && (j>=0) &&
			(i < m.length) && (j<m[0].length) &&
			!visited[i][j] && (m[i][j] ==1)) 
			return true;
		else 
			return false;
	}

}
