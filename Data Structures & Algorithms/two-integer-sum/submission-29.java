class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int n =0; n<nums.length ; n++){
            int remainder = target - nums[n];
            if(map.containsKey(remainder)){
                return new int[]{map.get(remainder),n};
            }
            map.put(nums[n],n);
        } 
    return new int [] {};
    }
}
