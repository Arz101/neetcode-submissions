class Solution {
    public boolean isPalindrome(String s) {
        var a = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        
        for (int i = 0, j = a.length()-1; (i != j && i < j); i++,j--){
            if (!Objects.equals(a.charAt(i), a.charAt(j))) return false;
        }
        return true;
    }
}
