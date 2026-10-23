class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     // choose a suitable data structure to store and extract
     HashMap<String, List<String>> map = new HashMap<>();
        //iterate trhough current array of strings
        for(String s: strs){
            //break down string into characters
            char [] singular = s.toCharArray();
            //sort characters
            Arrays.sort(singular);
            // make a new string of amalgamated characters
            String sortedS = new String(singular);
            // if  absent from key values meaning no other key is like it put in map and also start a new array list with it

            map.putIfAbsent(sortedS, new ArrayList<>());
            // add original string as first member of this sorted strings array list
            map.get(sortedS).add(s);
            
        }
        return new ArrayList<>(map.values());
    }
}
