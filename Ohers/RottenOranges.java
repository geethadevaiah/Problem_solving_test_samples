package Ohers;

import java.util.LinkedList;

public class RottenOranges {

	/**
	 * find how many minutes to take to all the fresh oranges to rotten
	 * 
	 * @param grid
	 * @return
	 */
	
	public int orangesRotting(int[][] grid) {
		
		if(grid == null || grid.length == 0) return 0;
		
		int rows = grid.length;
		int cols = grid[0].length;
		
		LinkedList<int[]> queue = new LinkedList<>();
		int count_fresh = 0;
		// put the positions of all the rotten oranges
		// count all the fresh oranges
		for(int i = 0 ; i < rows ; i++) {
			for(int j = 0; j < cols ; j++) {
				if(grid[i][j] == 2)
					queue.add(new int[]{i, j});
				if(grid[i][j] == 1)
					count_fresh++;
			}
		}
		// there are no fresh oranges to rotten
		if(count_fresh == 0) return 0;
		int count = 0;
		int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
		// starting bfs
		while(!queue.isEmpty()) {
			count++; // counting the number of rounds
			int size = queue.size();
			for(int i = 0 ; i < size; i++) {
				// get the point in the queue
				int[] point = queue.poll();
				// check for each directions
				for(int[] dir : dirs) {
					int x = point[0] + dir[0];
					int y = point[1] + dir[1];
					// if x, y is out of bound 
					// or the orange at (x,y) is already rotten 
					// or the cell at (x, y) is empty, then do nothing
					if(x < 0 || y < 0 || x >= rows || y >= cols || grid[x][y] == 0 || grid[x][y] == 2)
						continue;
					// mark the orange as rotten
					grid[x][y] = 2;
					// put it to the queue
					queue.add(new int[] {x,y});
					// decrease the number of fresh oranges
					count_fresh--;
				}
			}
		}
		if(count_fresh == 0)
			 return count-1;
		else return -1;
	}
}
