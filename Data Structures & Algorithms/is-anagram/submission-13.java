class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        char [] toS =s.toCharArray();
        char[] toT = t.toCharArray();
        Arrays.sort(toS);
        Arrays.sort(toT);
        return Arrays.equals(toS,toT); 
    }
}
