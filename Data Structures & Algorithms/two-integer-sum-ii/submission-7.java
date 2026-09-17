class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int end = numbers.length;
        int pointerZ = end -1;
        int pointerA = 0;

        while(pointerZ>pointerA){
            int sum = numbers[pointerZ] + numbers[pointerA];
            if(sum == target){

                return new int []{pointerA+1, pointerZ+1};
            }
            else if (sum>target){
                pointerZ--;
            }
            else if (sum<target){
                pointerA++;
            }

        }

    return new int []{};
    }
}
