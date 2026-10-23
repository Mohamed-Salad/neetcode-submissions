class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> locator = new HashMap<>();
            for(int part = 0;part<nums.length;part++ ){
                int remainder = target - nums[part];
                if(locator.containsKey(remainder)){
                    return new int []  {locator.get(remainder),part};
                }
                else{
                    locator.put(nums[part],part);
                }
            }
   return new int []  {};}
}
