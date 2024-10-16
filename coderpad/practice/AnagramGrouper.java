package gs.coderpad.practice;

import java.util.*;

public class AnagramGrouper {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat", "dog", "god","odg");
        Set<Set<String>> anagrams = groupAnagrams(words);

        // Print the result
        System.out.println(anagrams);
    }

    public static Set<Set<String>> groupAnagrams(List<String> words) {
        Map<String, List<String>> map = new HashMap<>();

        // Group words by their sorted character sequence
        for (String word : words) {
            // Sort the characters in the word to create a signature
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String signature = new String(chars);

            // Add the word to the corresponding group
            map.putIfAbsent(signature, new ArrayList<>());
            map.get(signature).add(word);
        }

        // Convert the map values to a set of sets
        Set<Set<String>> result = new HashSet<>();
        for (List<String> group : map.values()) {
            result.add(new HashSet<>(group)); // Create a new set for each group of anagrams
        }

        return result;
    }
}

