package Class_revision.Recursion_and_Backtracking;

public class TraverseDirectionInMaze {

	
	public static void traverseRatMaze(int n, int m, int i , int j, String osf) {
		
		// base case
		// rat has crossed the maze, come back 
		if(i > n || j > m)  return;
		
		// print when it has reached the end of the maze [0, 0] to [n-1, n-1] 0th indexs
		if(i == n-1 && j == m-1)  System.out.println(osf);
		
		// recursive intuition
		// Every time the rat has two choice
		// 1. Go right
		traverseRatMaze(n, m, i, j + 1 , osf+" R"); // going right direction
		// 2. Go downward direction
		traverseRatMaze(n, m, i + 1 , j, osf+" D"); // going downward direction
		
	}
	
	public static void main(String[] args) {
		// traverse the matrix from 0,0 to 3,3 (n, m)
		// print the ways to traverse the maze in either right or downward direction [R, D]
		traverseRatMaze(5, 5, 0, 0 , "");
	}
	
}
