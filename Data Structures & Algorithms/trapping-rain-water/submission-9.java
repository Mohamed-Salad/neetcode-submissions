class Solution {
    public int trap(int[] height) {
        if(height == null|| height.length == 0) return 0;
        int l = 0;
        int r = height.length - 1; 
        int lMax = height[l];
        int rMax = height[r];
        int water = 0;
        while (l<r){
            if(height[l]<height[r]){
                l++;
                lMax = Math.max(lMax,height[l]);
                water+= lMax-height[l];
            }
            else{
                r--;
                rMax = Math.max (rMax,height[r]);
                water+= rMax-height[r];

            }
        }
        return water;
    }
}
