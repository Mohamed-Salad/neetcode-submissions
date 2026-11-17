class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length(); 
        if(len1>len2) return false;
        int l = 0;
        int le = 0;
        char [] target = s1.toCharArray();
        Arrays.sort(target);
        for(int i=0;i<=len2-len1;i++){
            String windowToVerify = s2.substring(i,i+len1);
            char [] window2 = windowToVerify.toCharArray();
            Arrays.sort(window2);
            if(Arrays.equals(target,window2)) return true; 
        }
    return false;
    }
}
