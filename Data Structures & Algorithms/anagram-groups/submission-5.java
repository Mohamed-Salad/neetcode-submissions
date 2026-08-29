class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> map = new HashMap <>();
        for(String word : strs){
              char [] chars = word.toCharArray();
              Arrays.sort(chars);

              String sortedWordsKey = new String (chars);
              if(!map.containsKey(sortedWordsKey)){
                map.put(sortedWordsKey, new ArrayList <>());
              }

              map.get(sortedWordsKey).add(word);
    }
    
    return new ArrayList<>(map.values());
}
}
