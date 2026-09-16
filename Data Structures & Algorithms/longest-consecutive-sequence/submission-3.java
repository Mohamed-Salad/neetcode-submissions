class Solution {
    public int longestConsecutive(int[] nums) {
        /*Arrays.sort(nums);
            int counter = 0;
        for(int num = 0; num<nums.length ; num++){
            for(int check = num+1;check<nums.length;check++){
                if(nums[check]==nums[num]+1){
                    counter++;
                }
                
            }
        }
    if (counter == 0){
        return 0;
    }
    else{
        return counter;
    }*/
    Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int longest = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int length = 1;
                while (numSet.contains(num + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    
    }
}
