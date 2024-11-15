class Solution {
    public int \(int[] nums) {
        
        if(nums.length<=0){
            return 0;
        }

        HashSet<Integer> numSet = new HashSet<>();
        for(int num: nums){
            numSet.add(num);
        }

        int subSequence = 1;
        for(int num: numSet){
            if(numSet.contains(num-1)){
                continue;
            }
            else{
                int currSequence = 1;
                int currNum = num;
                while(numSet.contains(currNum+1)){
                    currSequence++;
                    currNum++;
                }
                subSequence = Math.max(subSequence, currSequence);
            }
        }
        return subSequence;
    }
}