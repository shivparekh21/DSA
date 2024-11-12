class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int[][] matrix = new int[text2.length()+1][text1.length()+1];

        for(int i=text2.length()-1; i>=0; i--){
            for(int j=text1.length()-1; j>=0; j--){
                if(text2.charAt(i)==text1.charAt(j)){
                    matrix[i][j] = matrix[i+1][j+1] + 1;
                }
                else{
                    matrix[i][j] = Math.max(matrix[i+1][j], matrix[i][j+1]);
                }
            }
        }
        return matrix[0][0];
    }
}