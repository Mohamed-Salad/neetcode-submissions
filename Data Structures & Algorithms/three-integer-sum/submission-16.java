class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int p = 0; p<nums.length-2;p++){
            if(p>0 && nums [p] == nums [p-1]) continue;
            int r = nums.length -1 ;
            int l = p +1; 
            while(l<r){
            int sum = nums[p] + nums [l] + nums [r];

            if ( sum < 0 ){
                l++;
            }
            else if ( sum>0){
                r--;
            }
            else{
                res.add(Arrays.asList(nums[p], nums[l] , nums[r]));
                l++;
                r--;
                    while ( l<r&& nums[l]==nums [l-1]) l++;
            }
            }
        }
   return res; }
}
