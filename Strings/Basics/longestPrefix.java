package Strings.Basics;

public class longestPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        longestPrefix obj = new longestPrefix();
        String[] strs = {"flower","flow","flight"};
        System.out.println(obj.longestCommonPrefix(strs));
    }
}


// Strings: "flower", "flow", "flight", "flowtt"

// Step 1: Initialize the Prefix
// - The function starts by initializing the prefix as the first string, which is "flower".

// Prefix: "flower"

// Step 2: Compare the Prefix with the Second String
// - The function compares the prefix "flower" with the second string "flow".
// - Since "flower" is not a prefix of "flow", the function updates the prefix by removing the last character.

// Prefix: "flowe"

// Step 3: Compare the Updated Prefix with the Second String
// - The function compares the updated prefix "flowe" with the second string "flow".
// - Since "flowe" is not a prefix of "flow", the function updates the prefix by removing the last character.

// Prefix: "flow"

// Step 4: Compare the Updated Prefix with the Third String
// - The function compares the updated prefix "flow" with the third string "flight".
// - Since "flow" is a prefix of "flight", the function does not update the prefix.

// Prefix: "flow"

// Step 5: Compare the Updated Prefix with the Fourth String
// - The function compares the updated prefix "flow" with the fourth string "flowtt".
// - Since "flow" is a prefix of "flowtt", the function does not update the prefix.

// Prefix: "flow"

// Step 6: Return the Longest Common Prefix
// - Since the function has compared the prefix with all strings and found a common prefix, it returns the longest common prefix.

// Longest Common Prefix: "flow"

// However, the function realizes that it can further reduce the prefix to "fl" and it will still be a common prefix among all strings.

// Longest Common Prefix: "fl"

// Therefore, the final output of the function is still "fl", which is the longest common prefix among the strings "flower", "flow", "flight", and "flowtt".
