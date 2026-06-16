class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        numMap.put(nums[0],0);
        for (int i = 1; i < nums.length; i++) {
            int res = target - nums[i];
            if (numMap.containsKey(res)) {
                return new int[] {numMap.get(res), i};
            }
            else numMap.put(nums[i], i);
        }
        return new int[0];
    }
}
