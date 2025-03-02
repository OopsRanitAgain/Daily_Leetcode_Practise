import java.util.LinkedHashSet;

class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        
        // Add elements to LinkedHashSet (removes duplicates)
        for (int num : nums) {
            set.add(num);
        }

        // Overwrite nums array with unique elements from the set
        int i = 0;
        for (int num : set) {
            nums[i++] = num; // Modify the original array
        }

        return set.size(); // Return count of unique elements
    }
}
