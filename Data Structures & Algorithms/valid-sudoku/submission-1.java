


class Solution {

    public boolean validBox(char[][] board,
                            int sr, int er, int sc, int ec) {

        HashSet<Character> yst = new HashSet<>();

        for (int p = sr; p <= er; p++) {
            for (int q = sc; q <= ec; q++) {

                if (board[p][q] == '.') {
                    continue;
                }

                if (yst.contains(board[p][q])) {
                    return false;
                }

                yst.add(board[p][q]);
            }
        }

        return true;
    }

    public boolean isValidSudoku(char[][] board) {

        
        for (int i = 0; i < 9; i++) {
            HashSet<Character> st = new HashSet<>();

            for (int j = 0; j < 9; j++) {

                if (board[i][j] == '.') {
                    continue;
                }

                if (st.contains(board[i][j])) {
                    return false;
                }

                st.add(board[i][j]);
            }
        }

        
        for (int k = 0; k < 9; k++) {
            HashSet<Character> set = new HashSet<>();

            for (int l = 0; l < 9; l++) {

                if (board[l][k] == '.') {
                    continue;
                }

                if (set.contains(board[l][k])) {
                    return false;
                }

                set.add(board[l][k]);
            }
        }

        
        for (int sr = 0; sr < 9; sr += 3) {
            int er = sr + 2;

            for (int sc = 0; sc < 9; sc += 3) {
                int ec = sc + 2;

                if (!validBox(board, sr, er, sc, ec)) {
                    return false;
                }
            }
        }

        return true;
    }
}
