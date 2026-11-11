class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int n = 0; n<nums.length; n++){
            if(n>0 && nums[n]== nums[n-1]){
                return true;
            }
        }
    return false;}
}