class Solution {
    public boolean hasDuplicate(int[] nums) {
       //return bruteForce(nums);
         //return sorting(nums);
         return hashSet(nums);
        }

    public boolean bruteForce(int [] nums){
        for(int i= 0 ; i<nums.length; i++)
        {for(int j= i+1 ;j<nums.length; j++) {
            if (nums[i]==nums[j]){
                return true; 
            }
        }}
        return false;     }

    public boolean sorting ( int [] nums){
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++){
            if (nums[i]==nums[i-1]){
                return true;
            }
        }
    return false;}

    public boolean hashSet (int [] nums){
        Set<Integer> seen = new HashSet<>();
        for(int element: nums){
            if(seen.contains(element)){
                return true;
            }
            seen.add(element);
        }
        return false;
    }
}