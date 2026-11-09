class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int pointer = 0; pointer<nums.length-2;pointer++){
            if(pointer>0 && nums[pointer] == nums[pointer-1] ) continue;          
            int l = pointer + 1;
            int r = nums.length -1;
            while(l<r){
                int sum = nums[l] + nums[r] + nums [pointer];
                if(sum<0){
                    l++;
                }
                else if(sum>0){
                    r--;
                }
                else {
                    res.add(Arrays.asList(nums[l],nums[r],nums[pointer]));
                    l++;
                    r--;
                    while(l<r&& nums[l] == nums[l-1]) l++;
                }
            }
            }
        return res;}
    }
