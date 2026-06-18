class Solution {
    public int lengthOfLongestSubstring(String s) {
        char [] string = s.toCharArray();
        Map<Character, Integer> chars = new HashMap<>();
        int left = 0;
        int max = 0;

        int counter = 0;
        for (char c: string) {
            counter++;
            if (!chars.containsKey(c)) chars.put(c,counter);
            else {
                left = Math.max(left, chars.get(c));
                chars.put(c, counter);
            }
            max = Math.max(max, counter - left);
        }
        return max;
    }
}
