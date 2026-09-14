class Solution {
    public boolean hasDuplicate(int[] nums){ 
        for(int outer = 0; outer<nums.length;outer++){
            for(int inner = outer +1; inner<nums.length; inner++){
                if (nums[inner] == nums[outer] ){
                    return true;
                }
            }
        }
        return false;}
    public boolean mapMethod(int [] nums){
        Map<Integer, Integer> map = new HashMap<>();
        for(int pointer= 0; pointer<nums.length; pointer ++){
            int value = nums[pointer];
            if (map.containsKey(value)){
                return true;
            }
            map.put(value,pointer);
        }

return false;  
    }
}


