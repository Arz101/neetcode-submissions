class Solution {
    public boolean hasDuplicate(int[] nums) {
        var count = new HashMap<>();
        
        for (var n : nums) {
            if (!count.containsKey(n)) count.put(n,1);
            else return true;
        }
        return false;
    }
}