class Solution {
    public boolean hasDuplicate(int[] nums){ 
        return mapMethod(nums);
    }
    public boolean sortingApproach (int [] nums){
        Arrays.sort(nums);
        for(int number=1;number<nums.length;number++){
            if(nums[number]==nums[number -1]){
                return true;
            }
        }
    return false;}
    public boolean bruteForceApproach (int [] nums){
         for(int outer = 0; outer<nums.length;outer++){
            for(int inner = outer +1; inner<nums.length; inner++){
                if (nums[inner] == nums[outer] ){
                    return true;
                }
           } 
    }return false;}
    public boolean mapMethod(int [] nums){
        Map<Integer, Integer> storage = new HashMap<>();
        for(int index = 0; index<nums.length; index++){
            int value  = nums[index];
            if(storage.containsKey(value)){
                return true;
            }
            storage.put(value,index);
        }
    return false;}
}


