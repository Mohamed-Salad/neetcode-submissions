class Solution {

    public String encode(List<String> strs) {
    // check if the list of strings is empty and return empty string if so
        if(strs.isEmpty()) return "";
        // step 1: make a list documenting list of strings inside input list of strings
        StringBuilder result = new StringBuilder ();
        List<Integer> sizes = new ArrayList<>();
        for(String str : strs){
            sizes.add(str.length());
        }
        // put after every length measure a comma separator in a new string builder

        for(int size : sizes){
            result.append(size).append(',');
        }

        // put at the end of the comma separted lengths a # signifying a end of decoding
        result.append('#');
        for(String str : strs){
            result.append(str);
        }
        return result.toString();
    }

  public List<String> decode(String str) {
        if (str.length() == 0) {
            return new ArrayList<>();
        }
        List<String> res = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();
        int i = 0;
        while (str.charAt(i) != '#') {
            StringBuilder cur = new StringBuilder();
            while (str.charAt(i) != ',') {
                cur.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(cur.toString()));
            i++;
        }
        i++;
        for (int sz : sizes) {
            res.add(str.substring(i, i + sz));
            i += sz;
        }
        return res;}

    }
