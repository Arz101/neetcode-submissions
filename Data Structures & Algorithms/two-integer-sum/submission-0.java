class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> n = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            var r = target - nums[i];
            if(n.containsKey(r)){
                return new int[] {n.get(r), i};
            } else n.put(nums[i], i);
        }

        return new int[] {};
    }
}
