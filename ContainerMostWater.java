class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int n = height.length-1;
        int water = 0;

        while(left<right){
            int maxWater = 0;
            if(height[left]<height[right]){
                maxWater = height[left]*n;
                left++;
                System.out.println(maxWater);
            }else{
                maxWater = height[right]*n;
                right--;
                System.out.println(maxWater);
            }
            water = Math.max(maxWater,water);
            n--;
        }
        return water;
    }
}