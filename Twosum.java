import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map to store: Key = the number, Value = its index
        Map<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement is already in our map
            if (prevMap.containsKey(complement)) {
                // Return the index of the complement and current index
                return new int[] { prevMap.get(complement), i };
            }

            // If not found, add the current number and index to the map
            prevMap.put(nums[i], i);
        }

        // Return an empty array if no solution is found (though the problem guarantees one)
        return new int[] {};
    }
}
