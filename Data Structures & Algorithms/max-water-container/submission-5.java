class Solution {
    public int maxArea(int[] heights) {
        int r = heights.length - 1; 
        int l = 0 ; 
        int res = 0;
   
        while (l<r){
                  int height = Math.min(heights[l],heights[r]);
        int width = r-l;
            int area = height * width ; 
            res = Math.max(res,area);            
            if(heights[l]<=heights[r]){
                l++;
            }
            else {
                r--;
            }
        }
  return res;
  }
}
