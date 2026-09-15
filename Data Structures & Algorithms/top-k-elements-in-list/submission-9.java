class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> frequency = new HashMap <>();
        for(int num : nums){
            frequency.put(num, frequency.getOrDefault(num,0)+1);
        }
        List<int []> arr = new ArrayList <>();

        for(Map.Entry<Integer,Integer>entry : frequency.entrySet()){
            arr.add(new int[]{entry.getValue(),entry.getKey()
            });}
            arr.sort((a,b)-> b[0] - a[0]);

            int [] answer= new int [k];
            for(int i=0; i<k;i++){
                answer [i] = arr.get(i)[1];
            }
      return answer;  }

    }
   
