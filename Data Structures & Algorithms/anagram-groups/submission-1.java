class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray); // Sort characters in the string
            String key = new String(charArray); // Create a key from sorted characters
            map.putIfAbsent(key, new ArrayList<>()); // Initialize the list if not present
            map.get(key).add(str); // Add the original string to the list
        }
        return new ArrayList<>(map.values()); // Return grouped anagrams as a list of lists
    }
}
    
