public class Solution {
    public String longestCommonPrefix(String[] strs) {
        // 1. Edge Case: If the array is null or empty, return an empty string
        if (strs == null || strs.length == 0) return "";
        
        // 2. Start by assuming the first string is the common prefix
        String prefix = strs[0];
        
        // 3. Iterate through the rest of the strings
        for (int i = 1; i < strs.length; i++) {
            // While the current string does not start with the current prefix
            // Use indexOf(prefix) != 0 to check if it's at the very beginning
            while (strs[i].indexOf(prefix) != 0) {
                // Shorten the prefix by one character from the end
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // 4. If the prefix becomes empty, there is no common prefix
                if (prefix.isEmpty()) return "";
            }
        }
        
        return prefix;
    }
}
