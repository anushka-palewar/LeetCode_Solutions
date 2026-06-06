class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1;
        int maxArea=0;

        while(l<=r){
            int w=r-l; //width
            int currArea=w * Math.min(height[l],height[r]);  

            if(height[l]<=height[r]){
                l++;
            }else{
                r--;
            }
            
            maxArea=Math.max(maxArea,currArea);
        }
        return maxArea;
    }
}