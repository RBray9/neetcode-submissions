class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> numMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int res = target - nums[i];
            if (numMap.containsKey(res)) {
                return new int[] {numMap.get(res), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[0];
    }
}
