class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        // key store 0-8 rows (indexes), value store the numbers in that row 
        HashMap<Integer, Set<Character>> rows = new HashMap<>();
        // key stores columns 0-8, value stores the numbers in that column
        HashMap<Integer, Set<Character>> columns = new HashMap<>();
        // key stores the scaled up indexes, value stores set of numbers
        // in the cube
        HashMap<String, Set<Character>> squares = new HashMap<>();

        for(int row = 0; row < 9; row++) {
            for(int column = 0; column < 9; column++){
                if(board[row][column] == '.'){
                    continue;
                }
                // then we must compute the key for the square right now
                // so we can use it in a bit to check the square hashmap
                String key = (row / 3) + "," + (column / 3);

                if(rows.computeIfAbsent(row, k -> new HashSet<>
                ()).contains(board[row][column]) ||
                columns.computeIfAbsent(column, k -> new HashSet<>
                ()).contains(board[row][column]) ||
                squares.computeIfAbsent(key, k -> new 
                HashSet<>()).contains(board[row][column])) {
                    // if its found within any of these sets
                    return false;
                }
                
                // now just add these to the set 
                rows.get(row).add(board[row][column]);
                columns.get(column).add(board[row][column]);
                squares.get(key).add(board[row][column]);
            }
        }

        return true;

       

    }
}
        

