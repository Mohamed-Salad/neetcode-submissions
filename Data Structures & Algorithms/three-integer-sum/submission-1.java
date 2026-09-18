class Solution {
   public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();  // ← add here
    
    Arrays.sort(nums);
    int target = 0;
    int end = nums.length - 1;
    
    for(int curr = 0; curr < end - 1; curr++) {
        if (curr > 0 && nums[curr] == nums[curr-1]) continue;  // ← add duplicate skip
        
        int left = curr + 1;
        int right = end;  // ← move inside for loop (was outside)
        
        while(left < right) {  // ← change from for to while
            int sum = nums[curr] + nums[left] + nums[right];
            
            if(sum == target) {
                result.add(Arrays.asList(nums[curr], nums[left], nums[right]));  // ← add this line
                
                while (left < right && nums[left] == nums[left+1]) left++;  // ← add dup skip
                while (left < right && nums[right] == nums[right-1]) right--;  // ← add dup skip
                
                left++;
                right--;
            }
            else if(sum > target) {
                right--;
            }
            else if(sum < target) {
                left++;
            }
        }
    }
    
    return result;  // ← change from new int}
}
}
