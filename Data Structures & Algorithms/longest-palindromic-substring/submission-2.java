class Solution {
    public String longestPalindrome(String s) {
       int start = 0;
       int end = 0;
       for (int i = 0; i < s.length(); i++) {
            int[] odd = expand(s, i, i);
            int[] even = expand(s, i, i + 1);
            if (odd[1] - odd[0] < even[1] - even[0]) odd = even;
            if (odd[1] - odd[0] > end - start) { start = odd[0]; end = odd[1]; }
       } 
       return s.substring(start, end + 1);
    }

    private int[] expand(String s, int start, int end) {
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) { 
            start --; end ++; 
        }
        return new int[] {start + 1, end - 1};
    }
}
