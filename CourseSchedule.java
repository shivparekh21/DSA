class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, List<Integer>> courseGraph = new HashMap<>();
        HashSet<Integer> visited = new HashSet<>();

        // HashMp is ready 
        for(int[] pre: prerequisites){
            //Adding prerequisites
            if(courseGraph.containsKey(pre[1])){
                courseGraph.get(pre[1]).add(pre[0]);
            }else{
                List<Integer> nextCourses = new LinkedList<>();
                nextCourses.add(pre[0]);
                courseGraph.put(pre[1], nextCourses);
            }
        }

        for(int i=0; i<numCourses; i++){
            if(courseSchedule(i, visited, courseGraph) == false){
                return false;
            }
        }
        return true;
    }

    public boolean courseSchedule(int i, HashSet<Integer> visited, HashMap<Integer, List<Integer>> courseGraph){
        if(visited.contains(i)){
            return false;
        }
        if(courseGraph.get(i)==null){
            return true;
        }
        visited.add(i);
        for(int pre: courseGraph.get(i)){
            if(courseSchedule(pre, visited, courseGraph)==false){
                return false;
            }
        }
        visited.remove(i);
        courseGraph.put(i, null);
        return true;
    }
}