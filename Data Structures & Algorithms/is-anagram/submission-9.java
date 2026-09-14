class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()){
            return false;
        }

        return sortingApproach(s,t);

    }


    public boolean sortingApproach (String s, String t){
        char []tSort = t.toCharArray();
        char []sSort = s.toCharArray();
        Arrays.sort(tSort);
        Arrays.sort(sSort);
        return Arrays.equals(tSort, sSort);
    }

}
