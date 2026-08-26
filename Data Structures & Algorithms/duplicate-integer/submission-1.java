class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int pointer= 0; pointer<nums.length; pointer ++){
            int value = nums[pointer];
            if (map.containsKey(value)){
                return true;
            }
            map.put(value,pointer);
        }

return false;    }
}