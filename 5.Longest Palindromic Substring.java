class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        
        int start = 0;
        int end = 0;
        
        for (int i = 0; i < s.length(); i++) {
            // Check for odd-length palindromes (e.g., "aba", center is 'b')
            int len1 = expandAroundCenter(s, i, i);
            // Check for even-length palindromes (e.g., "abba", center is between 'b' and 'b')
            int len2 = expandAroundCenter(s, i, i + 1);
            
            // Find the maximum length between both choices
            int len = Math.max(len1, len2);
            
            // Update the boundaries of the longest palindrome found so far
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        
        // Return the extracted longest substring
        return s.substring(start, end + 1);
    }
    
    private int expandAroundCenter(String s, int left, int right) {
        // Expand outwards as long as characters match and boundaries are valid
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Return the calculated length of this palindrome
        return right - left - 1;
    }
}
