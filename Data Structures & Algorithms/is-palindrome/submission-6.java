class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder newStr  = new StringBuilder ();
        for(char character : s.toCharArray()){
            if(Character.isLetterOrDigit(character)){
                newStr.append(Character.toLowerCase(character));
            }
        }
        return newStr.toString().equals(newStr.reverse().toString());    
    }
}
