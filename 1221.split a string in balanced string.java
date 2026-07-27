class Solution {
    public int balancedStringSplit(String s) {
        int balance = 0;
        int count = 0;
        
        for (char c : s.toCharArray()) {
            // Adjust the balance counter
            if (c == 'L') {
                balance++;
            } else {
                balance--;
            }
            
            // If balance is 0, we found a balanced substring
            if (balance == 0) {
                count++;
            }
        }
        
        return count;
    }
}
