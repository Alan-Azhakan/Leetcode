 class Solution {
    public int removeDuplicates(int[] nums) {
        // Edge case: if the array is empty, there are 0 unique elements
        if (nums.length == 0) return 0;

        // k is the pointer for the position of unique elements
        // We start at 1 because the first element is always unique
        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            // If current element is different from the previous one
            if (nums[i] != nums[i - 1]) {
                // Move the unique element to the 'k' position
                nums[k] = nums[i];
                // Increment the count of unique elements
                k++;
            }
        }

        // k represents the number of unique elements
        return k;
    }
}
