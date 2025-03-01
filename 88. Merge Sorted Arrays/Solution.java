import java.util.ArrayList;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> newArray = new ArrayList<>();

        int high = 0, low = 0;

        // Merge both arrays while elements are available in both
        while (high < m && low < n) {
            if (nums1[high] <= nums2[low]) {
                newArray.add(nums1[high]);
                high++;
            } else {
                newArray.add(nums2[low]);
                low++;
            }
        }

        // Add remaining elements from nums1
        while (high < m) {
            newArray.add(nums1[high]);
            high++;
        }

        // Add remaining elements from nums2
        while (low < n) {
            newArray.add(nums2[low]);
            low++;
        }

        // Copy merged elements back to nums1
        for (int i = 0; i < m + n; i++) {
            nums1[i] = newArray.get(i);
        }
    }
}
