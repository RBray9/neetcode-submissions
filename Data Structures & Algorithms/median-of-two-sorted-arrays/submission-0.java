class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums2.length < nums1.length) {
            int[] ph = nums2;
            nums2 = nums1;
            nums1 = ph;
        }
        // 1 has the smaller size
        int length1 = nums1.length;
        int length2 = nums2.length;
        int half = (length1 + length2) / 2;

        int min = 0;
        int max = nums1.length;
        while (min <= max) {
            int mid1 = (min + max) / 2;
            int mid2 = half - mid1;

            int left1  = mid1 > 0       ? nums1[mid1 - 1] : Integer.MIN_VALUE;
            int right1 = mid1 < length1 ? nums1[mid1]     : Integer.MAX_VALUE;
            int left2  = mid2 > 0       ? nums2[mid2 - 1] : Integer.MIN_VALUE;
            int right2 = mid2 < length2 ? nums2[mid2]     : Integer.MAX_VALUE;

            if (left1 <= right2 && left2 <= right1) {
                if ((length1 + length2) % 2 == 1) return Math.min(right1, right2);
                return (Math.max(left1,left2) + Math.min(right1, right2)) / 2.0;
            } else if (left1 > right2) {
                max = mid1 - 1;
            } else min = mid1 + 1;
        }
        return -1;
    }
}
