class Solution {
    public int[] twoSum(int[] nums, int target) {
        return mapApproach(nums,target);
    }

    public int [] bruteForce(int [] nums, int target){
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1 ; j<nums.length; j++){
                int sum = nums[i] + nums[j];
                if (sum==target){
                    return new int []   {i,j};
                }
            }
        }
    return new int []   {};}

    public int [] mapApproach (int [] nums, int target ){
        HashMap<Integer,Integer> contains = new HashMap<>();

        for(int i =0; i<nums.length; i++){
            int current = nums[i];
            int wanted = target - current ; 
            if(contains.containsKey(wanted)){
                return new int [] { contains.get(wanted),i};
            }
            else{
                contains.put(current,i);
            }
        }
    return new int [] {};}

   
}
