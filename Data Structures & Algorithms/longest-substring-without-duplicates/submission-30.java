class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        if(s ==null || s.length() ==0) return  0;
        int res =0;
        int l = 0;
        for(int r = 0; r<s.length(); r++){
            char a = s.charAt(r);
            while(seen.contains(a)){
                seen.remove(s.charAt(l));
                l++;
            }
            seen.add(a);
            res= Math.max(res,r-l+1);
            }

    return res;}
}
