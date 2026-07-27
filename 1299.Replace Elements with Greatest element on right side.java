class Solution {
    public int[] replaceElements(int[] arr) {
        int maxSoFar = -1;
        
        for (int i = arr.length - 1; i >= 0; i--) {
            // Save the current value before we overwrite it
            int current = arr[i];
            
            // Replace the current element with the greatest element seen to its right
            arr[i] = maxSoFar;
            
            // Update the maximum seen so far
            maxSoFar = Math.max(maxSoFar, current);
        }
        
        return arr;
    }
}
