class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        if(m*n!=r*c) return mat;// if reshape possible or not
        int[][] res = new int[r][c];
        for(int i=0;i<m*n;i++){//loop till the total elements
            res[i/c][i%c]=mat[i/n][i%n];//formula for finding row and coloumn
            //for row= index/column length ;
            //for col=index % col length;
        }
        return res;
    }
}