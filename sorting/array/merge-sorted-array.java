class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;        // Last element in valid nums1
        int p2 = n - 1;        // Last element in nums2
        int p = m + n - 1;     // Placement pointer at the back of nums1

        // Compare from the back while both arrays have elements left
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // If nums2 still has leftover elements, copy them over
        // (If nums1 has leftovers, they are already in their correct sorted spots!)
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }
}
