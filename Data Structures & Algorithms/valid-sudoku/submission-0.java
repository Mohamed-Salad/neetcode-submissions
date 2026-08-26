class Solution {
    public boolean isValidSudoku(char[][] board) {
        
   int[] rows = new int[9];
        int[] cols = new int[9];
        int[] boxes = new int[9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];
                if (num != '.') {
                    int bit = 1 << (num - '1');
                    if ((rows[i] & bit) != 0 || (cols[j] & bit) != 0 || (boxes[(i / 3) * 3 + j / 3] & bit) != 0) {
                        return false;
                    }
                    rows[i] |= bit;
                    cols[j] |= bit;
                    boxes[(i / 3) * 3 + j / 3] |= bit;
                }
            }
        }
        return true;
    }
}
