class Solution {
    public boolean hasDuplicate(int[] nums) { return set(nums);
   }
    public boolean bruteForce(int [] nums){
        int val; 
        int l= nums.length;
        for(int key= 0; key<l;key++){
            for(int dup = key +1;dup<l;dup++){
                if(nums[dup]==nums[key]){
                    return true;
                }
            }
        }
    return false;
    }
    public boolean mapper(int []nums){
        HashMap<Integer,Integer> uq= new HashMap<>();
        for(int key=0;key<nums.length;key++){
            if(uq.containsKey(nums[key])){
                return true;
            }
            uq.put(nums[key],key);
        }
    return false;}
    public boolean set (int []nums){
        Set<Integer> uq = new HashSet<>();
        for(int entry:nums){
            if(uq.contains(entry)){
                return true;
            }
        uq.add(entry);
        }
    return false;
    }
}

