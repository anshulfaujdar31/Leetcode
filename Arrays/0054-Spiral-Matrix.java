class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int startrow = 0;
        int endrow = matrix.length-1;
        int startcol = 0;
        int endcol = matrix[0].length-1;
        List<Integer> ans = new ArrayList<>();
        while(startrow<=endrow && startcol<=endcol){
            // for top boundary
            for(int j = startcol; j<=endcol; j++){
                ans.add(matrix[startrow][j]);
            }
            // for right 
            for(int i = startrow+1; i<=endrow; i++){
                ans.add(matrix[i][endcol]);
            }
            // for bottom 
            
            for(int j = endcol-1; j>=startcol; j--){
                if(startrow == endrow){
                break;
            }
                ans.add(matrix[endrow][j]);
            }
            // for left 
            
            for(int i = endrow-1; i>=startrow+1; i--){
                if(startcol == endcol){
                break;
            }
                ans.add(matrix[i][startcol]);
            }
            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }
        return ans;
        
    }
}