class Solution {
    public String sortSentence(String s) {
        // Split the sentence into individual words
        String[] words = s.split(" ");
        
        // Array to hold the words in their correct order
        String[] result = new String[words.length];
        
        for (String word : words) {
            // Get the 1-indexed position from the last character
            int index = word.charAt(word.length() - 1) - '0';
            
            // Extract the actual word (everything except the last character)
            // Place it in the correct 0-indexed spot
            result[index - 1] = word.substring(0, word.length() - 1);
        }
        
        // Join the array back into a single string separated by spaces
        return String.join(" ", result);
    }
}
