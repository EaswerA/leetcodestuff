class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(char[] curr: board){
            Arrays.fill(curr, '.');
        }
        int[] left = new int[n];
        int[] upperD = new int[2*n-1];
        int[] lowerD = new int[2*n-1];
        backtrack(board, 0, ans, left, upperD, lowerD, n);
        return ans;
    }

    private void backtrack(char[][] board, int col, List<List<String>> ans, int[] left, int[] upperD, int[] lowerD, int n){
        if(col == n){
            List<String> list = new ArrayList<>();
            for(int i=0; i<n; i++){
                StringBuffer sb = new StringBuffer();
                for(int j=0; j<n; j++){
                    sb.append(board[i][j]);
                }
                list.add(sb.toString());
            }
            ans.add(list);
            return;
        }
        for(int row=0; row<n; row++){
            if(left[row] == 0 && upperD[n-1 + col - row] == 0 && lowerD[row + col] == 0){
                board[row][col] = 'Q';
                left[row] = 1;
                upperD[n-1 + col - row] = 1;
                lowerD[row + col] = 1;
                backtrack(board, col+1, ans, left, upperD, lowerD, n);
                board[row][col] = '.';
                left[row] = 0;
                upperD[n-1 + col - row] = 0;
                lowerD[row + col] = 0;
            }
        }
    }
}
