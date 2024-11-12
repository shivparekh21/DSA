class Solution {
    public int climbStairs(int n) {
        int countOne = 1;
        int countTwo = 2;
        if(n==1){
            return n;
        }
          
        for(int i=3;i<=n;i++){
            int total = countOne + countTwo;
            countOne = countTwo;
            countTwo = total;
        }
          
        return countTwo;
    }
}