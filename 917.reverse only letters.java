class Solution {
    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            // Move left pointer until an English letter is found
            if (!Character.isLetter(chars[left])) {
                left++;
            } 
            // Move right pointer until an English letter is found
            else if (!Character.isLetter(chars[right])) {
                right--;
            } 
            // Swap both letters when valid
            else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        return new String(chars);
    }
}
