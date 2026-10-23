class Solution {
    public boolean hasDuplicate(int[] nums) {
        int val; 
        int l= nums.length;
        for(int key= 0; key<l;key++){
            for(int dup = key +1;dup<l;dup++){
                if(nums[dup]==nums[key]){
                    return true;
                }
            }
        }
    return false;}
}