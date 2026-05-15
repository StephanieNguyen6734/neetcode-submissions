class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet<Character>> rowHM = new HashMap<>();
        HashMap<Integer, HashSet<Character>> colHM = new HashMap<>();
        HashMap<String, HashSet<Character>> small3 = new HashMap<>();

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] == '.') {
                    continue;
                }
                rowHM.putIfAbsent(i, new HashSet<Character>());
                if(!rowHM.get(i).add(board[i][j])) {
                    return false;
                }

                colHM.putIfAbsent(j, new HashSet<Character>());
                if(!colHM.get(j).add(board[i][j])) {
                    return false;
                }

                // smaller square part to check
                StringBuilder sb = new StringBuilder();
                int scaledR = i / 3;
                int scaledC = j / 3;

                sb.append(scaledR);
                sb.append(scaledC);

                String scaledKey = sb.toString();
                small3.putIfAbsent(scaledKey, new HashSet<Character>());
                if(!small3.get(scaledKey).add(board[i][j])){
                    return false;
                }
            }
        }

        return true;

    }
}
