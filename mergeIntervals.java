class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
        LinkedList<int[]> output = new LinkedList<>();

        for(int[] interval: intervals){
            if(output.isEmpty() || output.getLast()[1]<interval[0]){
                output.add(interval);
            }
            else{
                output.getLast()[1] = Math.max(output.getLast()[1], interval[1]);
            }
        }
        return output.toArray(new int[output.size()][2]);
    }
}