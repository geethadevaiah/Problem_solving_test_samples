package Ohers;

public class Matrix01 {

boolean[][] seen;
    
    public int[][] updateMatrix(int[][] mat) {
        int[][] dist = new int[mat.length][mat[0].length];
         seen = new boolean[mat.length][mat[0].length];
        int ans = 0;
        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat[0].length ; j++){
                ans = Math.min(ans, distance(mat, i, j));
                dist[i][j] = ans;
            }
        }
        return dist;
    }
    
    public int distance(int[][] mat, int r, int c){
        if(r < 0 || r >= mat.length || c < 0 || c>=mat[0].length
           || seen[r][c] || mat[r][c] ==0)
            return 0;
        seen[r][c] = true;
        return (1 + distance(mat, r+1, c) + distance(mat, r-1, c) +
                    distance(mat, r, c-1) + distance(mat, r, c+1));
    }
}