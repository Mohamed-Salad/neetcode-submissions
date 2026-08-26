class Solution {
    public boolean isPalindrome(String s) {
    if (s.length() == 0) return true;
    s = s.toLowerCase();
    s = s.replaceAll("[^a-z0-9]", ""); // Remove non-alphanumeric characters

   for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
     if (s.charAt(i) != s.charAt(j)) return false;
   }
   return true;
 }
}
