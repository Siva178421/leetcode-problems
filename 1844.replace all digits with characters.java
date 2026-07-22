class Solution {
    public String replaceDigits(String s) {
        char[] arr = s.toCharArray();
        
        // Loop through odd indices where digits are located
        for (int i = 1; i < arr.length; i += 2) {
            // Shift the previous character by the numeric value of the current digit
            arr[i] = (char) (arr[i - 1] + (arr[i] - '0'));
        }
        
        return new String(arr);
    }
}
