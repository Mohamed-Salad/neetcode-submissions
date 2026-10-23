class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s: strs){
            char [] singular = s.toCharArray();
            Arrays.sort(singular);
            String sortedS = new String(singular);
            map.putIfAbsent(sortedS, new ArrayList<>());
            map.get(sortedS).add(s);
            
        }
        return new ArrayList<>(map.values());
    }
}
