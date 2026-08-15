class Solution {
    public int[] twoSum(int[] nums, int target) {
        return bruteForce(nums, target);
    }

    public int [] bruteForce (int [] nums, int target){
        for (int i= 0; i<nums.length; i++){
            for(int j = i+1 ; j<nums.length; j++){
                if(nums[i] + nums [j] == target){
                    return new int [] {i,j}; 
                }
            }
        }
    return new int []{};}


    public int [] twoPointers (int [] nums, int target){
        int [][] pairs = new int [nums.length][2];
        for (int i = 0; i<nums.length; i++){
            pairs[i][0]= nums [i];
            pairs[i][1] = i; 
        }
        Arrays.sort (pairs, Comparator.comparingInt(a-> a[0]));

        int i = 0, j = nums.length - 1; 
        while(i<j){
            int cur = pairs[i][0]+ pairs[j][0];
            if(cur== target){
                return new int []{Math.min(pairs [i][1], pairs [j][1]),
                                                                  Math.max(pairs[i][1], pairs[j][1])};
            } else if (cur < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[0];
    }
    }
  
