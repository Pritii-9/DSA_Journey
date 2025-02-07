package Patterns.Char_P;

import java.util.HashMap;
import java.util.Map;

public class wordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];
            if (map.containsKey(c) && !map.get(c).equals(word)) return false;
            if (!map.containsKey(c) && map.containsValue(word)) return false;
            map.put(c, word);
        }
        return true;
}
public static void main(String[] args) {
    wordPattern wp = new wordPattern();
    System.out.println(wp.wordPattern("abbb", "dog cat cat dog")); // true
}
}