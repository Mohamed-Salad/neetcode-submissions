class Solution {
    public void rotate(int[][] matrix) {
        bruteForce(matrix
        );
    }

    public void bruteForce (int [][] matrix){
        int n = matrix.length;
        int [][] rotated = new int [n][n];
        for(int i = 0; i<n ; i++){
            for(int j = 0; j<n ;j++){
                rotated [j][n-1-i] = matrix [i][j];
            }
        }
        for(int i=0; i<n ; i++){
            for(int j=0;j<n ;j++){
                matrix[i][j]=rotated [i][j];
            }
        }
    }
    public void twoP (int [][] matrix){
        int l =0;
        int r = matrix.length -1;
        while(l<r){
            for (int i = 0;i<r-1;i++){
                int top=l;
                int bottom =r;

                int topLeft = matrix [top][l+i];
                // numbers in the side going up
                matrix [top][l+i] = matrix [bottom ][r-i];
                //numbers at the bottom moving towards the side
                matrix [bottom -i][l] = matrix [bottom] [r-i];
                //monsters 
                matrix [bottom][r-i]=matrix [top +i][r];
                matrix [top+i][r] = topLeft;
            }
            r--;
            l++;
        }
    }
}
