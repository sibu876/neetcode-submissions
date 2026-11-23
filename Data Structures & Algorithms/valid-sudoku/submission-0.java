class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Set<String> set = new HashSet<>();
        for(int i=0;i<9;i++){
             for(int j=0;j<9;j++){
                 char num = board[i][j];

                 if(num == '.'){
                    continue;
                 }

                 if(num < '1' || num > '9'){
                    return false;
                 }

                 if(!set.add(num + "row" + i)){
                     return false;
                 }

                 if(!set.add(num + "col" + j)){
                    return false;
                 }

                 int box = (i/3) * 3 + (j/3);

                 if(!set.add(num + "box" + box)){
                    return false;
                 }

             }
        }

        return true;
    }
}
